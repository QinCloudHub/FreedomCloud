package com.songbird.initial.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/get/name")
    public String getName(String name){
        return "name:"+name;
    }
}
