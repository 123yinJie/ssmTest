package com.ssmTest.controller;

import com.ssmTest.entity.User;
import com.ssmTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Yinjie on 2020/11/18
 */
@RestController
@RequestMapping(value = "/userController")
public class UserController {
    @Autowired
    UserService service;
    @RequestMapping(value = "/findAll")
    public ModelAndView findAll(){
        ModelAndView mav = new ModelAndView();
        List<User> list = service.selectAll();
        System.out.println(list);
        mav.addObject("list",list);
        mav.setViewName("/userList");
        return mav;
    }
}
