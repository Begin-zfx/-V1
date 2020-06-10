package com.zfx.controller;

import com.zfx.entity.Complain;
import com.zfx.entity.FeedBack;
import com.zfx.service.impl.ComplainServiceImpl;
import com.zfx.service.impl.FeedBackServiceImpl;
import com.zfx.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class FeedBackController {

    @Autowired
    FeedBackServiceImpl feedBackService;

    //到投诉反馈页面并且获取数据库中feedback数据
    @GetMapping("/toFeedback")
    public String toFeedbackPage(Map<String ,Object> map){
        List<FeedBack> feedBacks = feedBackService.getAll();
        map.put("fds",feedBacks);
        return "Feedback";
    }
    //插入数据方法
    @PostMapping("/insertCpText")
    @ResponseBody
    public Msg insertCpText(FeedBack feedBack){
        feedBack.setFdid(null);
        Date date = new Date();
        feedBack.setFdtime(date);
        boolean b = feedBackService.insertCpText(feedBack);
        if(b==true){
            return Msg.success().add("va_msg","反馈内容插入成功！");
        }else {
            return Msg.fail().add("va_msg","反馈内容插入失败！");
        }
    }


}
