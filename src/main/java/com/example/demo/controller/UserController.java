package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user")
    public User getUser(@RequestParam(value = "pid") String pid, @RequestParam(value = "uid") String uid){
        User a= new User();
        a.setPid(pid);
        a.setUid(uid);
        return a;
    }
}
