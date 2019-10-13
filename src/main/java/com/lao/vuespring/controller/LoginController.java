package com.lao.vuespring.controller;

import com.lao.vuespring.mapper.UserMapper;
import com.lao.vuespring.pojo.Result;
import com.lao.vuespring.pojo.User;
import com.lao.vuespring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;

    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        System.out.println(username);
        System.out.println(requestUser.getPassword());
        //if (!"admin".equals(username) || "123456".equals(requestUser.getPassword())) {
        /*
        if (!Objects.equals("admin", username) || !Objects.equals("123456", requestUser.getPassword())) {
            System.out.println("账号密码错误");
            return new Result(400);
        } else {
            System.out.println("账号密码OK");
            return new Result(200);
        }*/
        //User user = userService.get(username, requestUser.getPassword());
        com.lao.vuespring.beans.User user = userMapper.getUserByUsername(username);
        if (null == user) {
            return new Result(400);
        } else {
            return new Result(200);
        }
    }
}
