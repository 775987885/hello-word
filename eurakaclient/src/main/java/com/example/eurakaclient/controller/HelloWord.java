package com.example.eurakaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName HelloWord
 * @Description TODO
 * @Author ghjia
 * @Date 2019/4/29 17:26
 * @@Version 1.0
 **/
@RestController
public class HelloWord {
@Value("${server.port}")
    String port;
    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        return "hi "+name + ",i am from port :" + port;
    }
}
