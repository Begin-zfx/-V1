package com.zfx.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zfx.entity.SeatResver;
import com.zfx.service.impl.SeatResverServiceImpl;
import com.zfx.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SeatResverController {

    @Autowired
    SeatResverServiceImpl seatResverService;

    /*
    * 点击预约信息的提交按钮，保存该预约信息
    * */
    @PostMapping("/insertSeatResver")
    @ResponseBody
    public Msg insertSeatResver(SeatResver seatResver,@RequestParam("status") String status){
        seatResver.setResverid(null);
        seatResverService.insertSeatResver(seatResver,status);
        return Msg.success().add("va_msg","预约座位信息插入成功！");
    }
    /*
    * 点击预约信息的提交按钮，校验该用户是否已经预约
    * */
    @GetMapping("/checkSeatResverUserID/{userid}")
    @ResponseBody
    public Msg checkSeatResverUserID(@PathVariable("userid") Integer userid){
        boolean b = seatResverService.checkUserID(userid);
        if (b){
            return Msg.fail().add("va_msg","该用户已预约或已上座，请重新输入！");
        }else {
            return Msg.success().add("va_msg","");
        }
    }
    /*
    * 点击取消按钮，删除预约信息（根据座位号）
    * */
    @DeleteMapping("/deleteSeatResver/{seatid}")
    @ResponseBody
    public Msg deleteSeatResver(@PathVariable("seatid") Integer seatid){
        boolean b = seatResverService.deleteSeatResver(seatid);
        if (b){
            return Msg.success().add("va_msg","删除预约信息成功！");
        }else {
            return Msg.fail().add("va_msg","删除预约信息失败！");
        }
    }

    /*
    * 获取全部预约信息，返回到前端展示再页面中
    * */
    @GetMapping("/getSeatResverInfo")
    @ResponseBody
    public Msg getSeatResverInfo(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,6);
        List<SeatResver> all = seatResverService.getAll();
        PageInfo<SeatResver> page=new PageInfo<SeatResver>(all,5);
        return Msg.success().add("pageInfo",page);
    }

    /*
    * 模糊查询，seatid
    * */
    @GetMapping("/querySeatlike/{seatid}")
    @ResponseBody
    public Msg getSeatResver(@PathVariable("seatid") Integer seatid
            ,@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,20);
        List<SeatResver> all = seatResverService.getSeatAll(seatid);
        PageInfo<SeatResver> page=new PageInfo<SeatResver>(all,5);
        return Msg.success().add("pageInfo",page);
    }
}
