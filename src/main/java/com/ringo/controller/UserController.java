package com.ringo.controller;

import com.ringo.service.UserService;
import com.ringo.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("user/{name}")
    public User queryUserByUsername(@PathVariable String name){
       return userService.queryUserByUsername(name);
    }
}
