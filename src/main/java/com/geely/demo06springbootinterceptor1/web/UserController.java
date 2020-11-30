package com.geely.demo06springbootinterceptor1.web;

import com.geely.demo06springbootinterceptor1.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.RequestWrapper;

@Controller
public class UserController {
    @RequestMapping(value = "/login")
    public @ResponseBody Object login(HttpServletRequest request){
        User user = new User;
        user.setId(1001);
        user.setUsername("谢俊豪");
        request.getSession().setAttribute("user",user);
        return "login SUCCESS";
    }
    @RequestMapping(value = "/center")
    public @ResponseBody Object center(){
        return "See Center Message";
    }
    //该请求不登陆也可访问
    @RequestMapping(value = "/out")
    public @ResponseBody Object out(){
        return "Out see anytime";
    }
    //如果用户未登录访问了需要登陆才可以访问的请求，之后会跳转至该请求路径
    @RequestMapping(value = "/error")
    public @ResponseBody Object error(){
        return "error";
    }






}
