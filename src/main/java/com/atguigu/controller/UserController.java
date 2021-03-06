package com.atguigu.controller;

import com.atguigu.entities.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/user/findAll")
    public List<User> findAll(){
        List<User> users = userService.findUsers();
        System.out.println("users = " + users);
        return users;
    }
}
