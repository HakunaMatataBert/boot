package com.spring.boot.controller;

import com.spring.boot.bean.User;
import com.spring.boot.service.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    private UserImpl userImpl;
    @RequestMapping("/index")
    public  String index(Model model, HttpServletRequest request,User user){
        userImpl.add(user);
        model.addAttribute("user",userImpl.AllUser().size()==0?"":userImpl.AllUser());
        return "index";
    }
    @RequestMapping("/delete")
    public String deleteAll(Model model){//删除所有的信息
        userImpl.deleteAll();
        model.addAttribute("user",userImpl.AllUser().size()==0?"":userImpl.AllUser());
        return "index";
    }
}
