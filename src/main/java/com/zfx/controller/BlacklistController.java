package com.zfx.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zfx.entity.Blacklist;
import com.zfx.service.impl.BlacklistServiceImpl;
import com.zfx.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class BlacklistController {

    @Autowired
    BlacklistServiceImpl blacklistService;

    //跳转到黑名单管理页面，并且返回黑名单数据
    @GetMapping("/toBlacklist")
    public String toBlacklistPage(Map<String ,Object> map){
        List<Blacklist> blacklists = blacklistService.getAll();
        map.put("bls",blacklists);
        return "Blacklist";
    }

    /*
    * 前端请求，返回黑名单数据
    * */
    @GetMapping("/getBlacklist")
    @ResponseBody
    public Msg getBlacklist(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,6);
        List<Blacklist> blacklists = blacklistService.getAll();
        PageInfo<Blacklist> page=new PageInfo<Blacklist>(blacklists,5);
        return Msg.success().add("pageInfo",page);
    }

    /*
    * 前端ajax请求，解除冻结的黑名单
    * */
    @PutMapping("/updateStatusJC")
    @ResponseBody
    public Msg updateStatusJC(Integer blackid){
        boolean b = blacklistService.updateStatusJC(blackid);
        if (b){
            return Msg.success().add("va_msg","解除成功") ;
        }else {
            return Msg.fail().add("va_msg","解除失败");
        }
    }
    //冻结
    @PutMapping("/updateStatusDC")
    @ResponseBody
    public Msg updateStatusDC(Integer blackid){
        boolean b = blacklistService.updateStatusDJ(blackid);
        if (b){
            return Msg.success().add("va_msg","冻结成功") ;
        }else {
            return Msg.fail().add("va_msg","冻结失败");
        }
    }
}
