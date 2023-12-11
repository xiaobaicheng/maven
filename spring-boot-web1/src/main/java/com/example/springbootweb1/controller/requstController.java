package com.example.springbootweb1.controller;

import com.example.springbootweb1.pojo.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class requstController {
    @RequestMapping("/simpleParam")
    public String simpleParam(String name,Integer age){
        System.out.println("传过来的数据：" + name + age);
        return "ok";
    }
    @RequestMapping("/simplepojo")

    public String simplepojo(User user){
        System.out.println(user);
        return "Ok";
    }
    @RequestMapping("/simplepojoaddress")
    public String simplepojoaddress(User user){
        System.out.println(user);
        return "Ok";
    }
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "ok";
    }

}
