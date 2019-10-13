package com.lao.vuespring.controller;

import com.lao.vuespring.beans.User;
import com.lao.vuespring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    @ResponseBody
    @GetMapping("/getuser/{username}")
    public User getUser(@PathVariable("username") String username){

        User user = userMapper.getUserByUsername(username);
        System.out.println(user);
        return user;
    }

    @ResponseBody
    @GetMapping("/newuser")
    public User newUser(User user){
        userMapper.insertUser(user);
        return user;
    }
}
