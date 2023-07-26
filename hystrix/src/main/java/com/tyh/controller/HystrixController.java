package com.tyh.controller;


import com.tyh.entity.student;
import com.tyh.feign.FeignProvideClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixController
{

    @Autowired
    private FeignProvideClient feignProvideClient;
    @GetMapping("/findAll")
    public Collection<student> findAll(){
        return   feignProvideClient.findAll();
    }
    @GetMapping("/index")
    public String index(){
        return feignProvideClient.index();
    }
}
