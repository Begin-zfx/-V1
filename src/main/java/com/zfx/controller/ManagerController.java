package com.zfx.controller;

import com.zfx.entity.Manager;
import com.zfx.service.impl.ManagerServiceImpl;
import com.zfx.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ManagerController {

    @Autowired
    ManagerServiceImpl managerService;

    //进入忘记密码页面
    @RequestMapping("/forgotPwd")
    public String toForgotPage(){
        return "ForgotPassword";
    }
    @RequestMapping("/forgotPwd2")
    public String toForgotPage2(){
        return "ForgotPassword2";
    }

    //进入重置密码页面
    @RequestMapping("/register")
    public String toRegisterPage(){
        return "Register";
    }

    //登陆和忘记密码==》检查用户名是否存在
    @GetMapping("/checkLoginManagerName")
    @ResponseBody
    public Msg checkLoginManagerName(@RequestParam("managername") String managername1){
        String managername = managername1.trim();
        String regex = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\\u2E80-\\u9FFF]+$)";

        boolean c = managername.matches(regex);
        if(!c) {
            return Msg.fail().add("va_msg", "用户名是2-5位中文，或者6-16位英文和数字的组合");
        }
        boolean b = managerService.checkManagerName(managername);
        if (b==true){
            return Msg.fail().add("va_msg","用户名不存在！");
        }else {
            return Msg.success().add("va_msg","");
        }
    }
    //注册检查用户名是否存在
    @GetMapping("/checkManagerName")
    @ResponseBody
    public Msg checkManagerName(@RequestParam("managername") String managername1){
        String managername = managername1.trim();
        String regex = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\\u2E80-\\u9FFF]+$)";
        boolean c = managername.matches(regex);
        if(!c) {
            return Msg.fail().add("va_msg", "用户名可以是2-5位中文，或者6-16位英文和数字的组合");
        }
        boolean b = managerService.checkManagerName(managername);
        if (b==true){
            return Msg.success().add("va_msg","用户名可用！");
        }else {
            return Msg.fail().add("va_msg","用户名已存在！");
        }
    }
    //检查手机号是否是十一位
    @GetMapping("/checkManagerTel")
    @ResponseBody
    public Msg checkManagerTel(@RequestParam("managertel") String managertel1){
        String managertel = managertel1.trim();
        String regex = "(^1\\d{10}$)";
        boolean matches = managertel.matches(regex);
        if(matches == true){
            return Msg.success().add("va_msg"," ");
        }else{
            return Msg.fail().add("va_msg","手机号必须以1开头，11位的数字！");
        }
    }
    //登陆检查密码
    @GetMapping("/checkLoginManagerPwd")
    @ResponseBody
    public Msg checkLoginManagerPwd(@RequestParam("managerpwd") String managerpwd1){
        String managerpwd = managerpwd1.trim();
        String regex = "(^[a-zA-Z0-9_-]{6,16}$)";
        boolean matches = managerpwd.matches(regex);
        if(matches == true){
            return Msg.success().add("va_msg"," ");
        }else{
            return Msg.fail().add("va_msg","密码格式不正确：必须超过6位，小于16位！");
        }
    }
    //注册检查密码
    @GetMapping("/checkManagerPwd")
    @ResponseBody
    public Msg checkManagerPwd(@RequestParam("managerpwd") String managerpwd1){
        String managerpwd = managerpwd1.trim();
        String regex = "(^[a-zA-Z0-9_-]{6,16}$)";
        boolean matches = managerpwd.matches(regex);
        if(matches == true){
            return Msg.success().add("va_msg"," ");
        }else{
            return Msg.fail().add("va_msg","密码格式不正确：必须超过6位，小于16位！");
        }
    }




    /*新增管理员
    **/
    @PostMapping("/registerManager")
    public String registerManger(Manager manager,Map<String,Object> map){
        manager.setManagerid(null);
        boolean flag = managerService.createManager(manager);
        if(flag == true){
            map.put("msg","插入成功！");
            return "redirect:share.html";
        }else{
            map.put("msg","插入失败！");
            return "Register";
        }
    }

    //点击进入按钮校验用户名和密码是否正确
    @PostMapping("/loginD")
    public String loginDashboard(@RequestParam("managername") String managername1,
                                 @RequestParam("managerpwd") String managerpwd1,
                                 Map<String,Object> map, HttpSession session){
        /*
         * ==true没有该用户
         * ==false 用户存在
         * */
        String managername = managername1.trim();
        String managerpwd = managerpwd1.trim();
        if(managername != "" && managerpwd!=""){
            boolean name = managerService.checkManagerName(managername);
            boolean pwd = managerService.checkManagerPwd(managerpwd);
            if(name == false && pwd ==false ){
//                System.out.println("用户名或密码正确！");
                session.setAttribute("username",managername);
                return "redirect:/user22";
            }else{
//                System.out.println("密码错误！");
                map.put("msg","账号密码错误，请重新输入账号和密码！");
                return "Login";
            }
        }else {
            map.put("msg","请输入账号or密码！");
            return "Login";
        }
    }

    /*resetpwd
     * 点击确认修改密码并且返回登陆页面*/
    @PutMapping("/resetpwd")
    public String backLogin(@RequestParam("managername") String managername1,
                            @RequestParam("managerpwd") String managerpwd1,
                            Map<String,Object> map){
        String managername = managername1.trim();
        String managerpwd = managerpwd1.trim();
        if (managername != "" && managerpwd != ""){
            boolean tel = managerService.checkManagerName(managername);
            if(tel == true){
                map.put("msg","账号不存在，请重新输入！");
                return "ForgotPassword";
            }else {
                int i = managerService.updateUserPwd(managername,managerpwd);
                map.put("msg","reset success!");
                if(i>0){
                    return "redirect:/share.html";
                }else {
                    return "ForgotPassword";
                }
            }
        }else {
            map.put("msg","账号或新密码为空，请输入！");
            return "ForgotPassword";
        }
    }
    @PutMapping("/resetpwd2")
    public String backLogin2(@RequestParam("managername") String managername1,
                            @RequestParam("managerpwd") String managerpwd1,
                            Map<String,Object> map){
        String managername = managername1.trim();
        String managerpwd = managerpwd1.trim();
        if (managername != "" && managerpwd != ""){
            boolean tel = managerService.checkManagerName(managername);
            if(tel == true){
                map.put("msg","账号不存在，请重新输入！");
                return "ForgotPassword2";
            }else {
                int i = managerService.updateUserPwd(managername,managerpwd);
                map.put("msg","reset success!");
                if(i>0){
                    return "redirect:/forgotPwd2";
                }else {
                    return "ForgotPassword2";
                }
            }
        }else {
            map.put("msg","账号或新密码为空，请输入！");
            return "ForgotPassword2";
        }
    }

}
