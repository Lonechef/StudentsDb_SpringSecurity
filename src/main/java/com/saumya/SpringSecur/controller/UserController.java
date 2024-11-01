package com.saumya.SpringSecur.controller;


import com.saumya.SpringSecur.model.User;
import com.saumya.SpringSecur.service.MyUserDetailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private MyUserDetailService.UserService userService;
    @PostMapping("register")
    public User register(@RequestBody User user){
        return userService.saveUser(user);
    }

}
