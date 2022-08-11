package com.songbird.initial.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    public TestFeign TestFeign;

    @GetMapping("/test")
    public String getName(){
        String name = TestFeign.getName("我叫王五");
        System.out.println(name);
        return name;
    }
}
