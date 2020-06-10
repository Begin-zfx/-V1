package com.zfx.controller;

import com.zfx.entity.Seat;
import com.zfx.service.impl.SeatServiceImpl;
import com.zfx.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class SeatController {
    @Autowired
    SeatServiceImpl seatService;
    /*
    * 获取数据库座位信息，返回map中
    * */
    @GetMapping("/seat")
    public String seat(Map<String,Object> map){
        List<Seat> seats = seatService.getAll();
        map.put("seats",seats);
        return "SeatResver";
    }

    //前端发起请求来修改座位状态，置为0
    @PutMapping("/updateSeatState/{seatid}")
    @ResponseBody
    public Msg updateState(@PathVariable("seatid") Integer seatid){
        boolean b = seatService.updateSeatState(seatid);
        if (b){
            return Msg.success().add("va_msg","状态位置0成功！");
        }else {
            return Msg.fail().add("va_msg","状态位置0失败！");
        }
    }
    //前端发起请求来修改座位状态，置为1
    @PutMapping("/updateSeatStateYY")
    @ResponseBody
    public Msg updateState1(@RequestParam("seatid") Integer seatid,
                            @RequestParam("status") String status){
        boolean b = seatService.updateSeatState1(seatid,status);
        if (b){
            return Msg.success().add("va_msg","预约成功！");
        }else {
            return Msg.fail().add("va_msg","预约失败!");
        }
    }
}
