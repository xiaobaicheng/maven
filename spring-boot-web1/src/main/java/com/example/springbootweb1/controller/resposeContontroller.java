package com.example.springbootweb1.controller;

import com.example.springbootweb1.pojo.Address;
import com.example.springbootweb1.pojo.Result;
import com.example.springbootweb1.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class resposeContontroller {
    @RequestMapping("/getarr")
    public int[] getarr(){
        int[] arr = {12,32,4,345,35};
        return arr;
    }
    @RequestMapping("/getArddress")
    public Result getArddress(){
        Address address = new Address("北京","海鼎");
        User user = new User("陈", 21,address);
        return Result.success(user);
    }
}
