package com.zfx.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zfx.entity.Complain;
import com.zfx.service.impl.ComplainServiceImpl;
import com.zfx.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class ComplainController {

    @Autowired
    ComplainServiceImpl complainService;

    //来到投诉页面
    @RequestMapping("/toComplain")
    public String toComplainPage(Map<String,Object> map){
        List<Complain> complains = complainService.getAll();
        map.put("cps",complains);
        return "Complain";
    }
    //AJAX通过请求返回投诉列表
    @GetMapping("/complainList")
    @ResponseBody
    public Msg ComplainData(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,6);
        List<Complain> complains = complainService.getAll();
        PageInfo<Complain> page=new PageInfo<Complain>(complains,5);
        return Msg.success().add("pageInfo",page);
    }

    /*更新ps中的处理状态*/
    @PutMapping("/updatePs")
    @ResponseBody
    public Msg updatePss(Integer cpid){
        boolean b = complainService.updatePs(cpid);
        if (b == true){
            return Msg.success().add("va_msg","ps状态更新成功");
        }else{
            return Msg.fail().add("va_msg","ps状态更新失败");
        }
    }

    /*根据cpid删除投诉数据*/
    @DeleteMapping("/deleteCp/{cpid}")
    @ResponseBody
    public Msg deleteCp2(@PathVariable("cpid") int cpid){
        boolean b = complainService.deleteCp(cpid);
        if (b == true){
            return Msg.success().add("va_msg","cp删除成功");
        }else{
            return Msg.fail().add("va_msg","cp删除成功");
        }
    }

    //点击编辑按键传入userid查询用户，返回用户信息
    @GetMapping("/queryCpByID/{cpid}")
    @ResponseBody
    public Msg queryUserID(@PathVariable("cpid") Integer cpid){
        Complain cpByID = complainService.getCpByID(cpid);
        return Msg.success().add("cp",cpByID);
    }
}
