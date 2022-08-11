package com.songbird.initial.controller;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("cloud")
public interface TestFeign {

    // 表明这个接口是一个feign客户端,里面的参数表示从哪个服务提供者获取数据


        @PostMapping("/get/name")
        public String getName(@RequestParam("name") String name);

}
