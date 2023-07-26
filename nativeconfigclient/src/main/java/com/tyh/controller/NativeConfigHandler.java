package com.tyh.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nativeconfig")
public class NativeConfigHandler {

    @Value("${server.port}")
    private String  port;
    @Value("${foo}")
    private String foo;

    @GetMapping("/getport")
    public String getPort(){
        return "获取的port为"+port;
    }
    @GetMapping("/getfoo")
    public String getFoo(){
        return "获取的foo为"+foo;
    }
}
