package com.lao.vuespring.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.lao.vuespring.beans.User;
import com.lao.vuespring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    @ResponseBody
    @RequestMapping(value = "/postuser")
    public User postUser(User user){
        System.out.println(user);
        User u = userMapper.getUserByUsername(user.getUsername());
        System.out.println(u);
        return u;
    }

    @ResponseBody
    @GetMapping("/newuser")
    public User newUser(User user){
        userMapper.insertUser(user);
        return user;
    }
}
