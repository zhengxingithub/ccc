package com.tecode.controller;

import com.tecode.model.User;
import com.tecode.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;
//    @RequestMapping("login")
//    public String login(){
//        return "/index";
//    }

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }

    @RequestMapping("/login")
    public ModelAndView login(User user, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        User user1 = userService.login(user);
        if(user1 != null ){
            modelAndView.addObject(user1);
            modelAndView.setViewName("test");
        }else{
            modelAndView.setViewName("forward:/index");
        }

        return modelAndView;
    }
}
