package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    List<String> messages = new ArrayList<>();

    @RequestMapping("/user")
    public User getUser(@RequestParam(value = "pid") String pid, @RequestParam(value = "uid") String uid){
        User a= new User();
        a.setPid(pid);
        a.setUid(uid);
        return a;
    }

    @RequestMapping("/tishqon")
    public String getTishqon(@RequestParam(value = "pid") String input){

        System.out.println(input);
        messages.add(input);
        return input;
    }

    @RequestMapping("/getAllText")
    public List<String> add(){
        return messages;
    }
}
