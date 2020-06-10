package com.zfx.controller;

import com.zfx.entity.Statistic;
import com.zfx.service.impl.StatisticServiceImpl;
import com.zfx.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class StatisticController {
    @Autowired
    StatisticServiceImpl statisticService;
    /*
     * 到图表分析页面
     * */
    @GetMapping("/charts")
    public String toChartsPage(){
        return "Charts";
    }
    /*
    * 获取全部数据
    * */
    @GetMapping("/user22")
    public String getAllUser(Map<String,Object> map){
        List<Statistic> statistics = statisticService.getAll();
        map.put("statistics",statistics);
        return "SeatChart";
    }

    /*
     * 获取信息展示到页面中
     * */
    @GetMapping("/getStaInfo")
    @ResponseBody
    public Msg staInfo(){
        List<Statistic> statistics = statisticService.getAll();
        return Msg.success().add("statistics",statistics);
    }
}
