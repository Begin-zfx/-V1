package com.zfx.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zfx.entity.Seatuse;
import com.zfx.service.impl.SeatuseServiceImpl;
import com.zfx.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class SeatuseController {
    @Autowired
    SeatuseServiceImpl seatuseService;

    /*
     *  通过用户ID进行查询
     * */
    @GetMapping("/queryByUserID/{userid}")
    @ResponseBody
    public Msg queryUserID(@RequestParam(value = "pn",defaultValue = "1") Integer pn,
                           @PathVariable("userid") Integer userid){
        PageHelper.startPage(pn,20);
        List<Seatuse> users = seatuseService.queryByUserID(userid);
        PageInfo<Seatuse> page=new PageInfo<Seatuse>(users,5);
        return Msg.success().add("pageInfo",page);
    }
    /*
    * 到座位使用统计页面
    * */
    @RequestMapping("/seatUseCount")
    public String toSeatUserPage(Map<String,Object> map){
        List<Seatuse> seatusers = seatuseService.getAll();
        map.put("sus",seatusers);
        return "SeatUse";
    }

    @GetMapping("/seatUsePage")
    @ResponseBody
    public Msg SeatUserInfo(@RequestParam(value = "pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,6);
        List<Seatuse> seatusers = seatuseService.getAll();
        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就好了
        //封装了详细的分页信息，包括有我们查询出来的数据，传入连续显示的页数
        PageInfo<Seatuse> page=new PageInfo<Seatuse>(seatusers,5);
        return Msg.success().add("pageInfo",page);
    }


    /*
    * 插入数据到记录表中
    * */
    @PostMapping("/insertSUInfo")
    @ResponseBody
    public Msg insertSUInfo(Seatuse seatuse, @RequestParam("status") String status){
        boolean b = seatuseService.insertSeatUseInfo(seatuse, status);
        if (b){
            return Msg.success().add("va_msg","插入到座位使用记录表成功！");
        }else {
            return Msg.fail().add("va_msg","插入到座位使用记录表失败！");
        }
    }

    @DeleteMapping("/deleteSeatUseByID/{seatuserid}")
    @ResponseBody
    public Msg deleteSeatUserInfo(@PathVariable("seatuserid") Integer seatuserid){
        boolean b = seatuseService.deleteSeatUserInfo(seatuserid);
        if(b){
            return Msg.success().add("va_msg","删除成功座位使用记录");
        }else {
            return Msg.fail().add("va_msg","删除失败座位使用记录");
        }
    }

    /*
    * 获取状态为1的数据条数
    * */
    @GetMapping("/state1Count/{state}")
    @ResponseBody
    public Msg state1Count(@PathVariable("state") String state){
        long l = seatuseService.queryStateCount(state);
        return Msg.success().add("state1Count",l);
    }
}
