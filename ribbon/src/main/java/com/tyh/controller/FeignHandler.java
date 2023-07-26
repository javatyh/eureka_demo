package com.tyh.controller;


import com.tyh.entity.student;
import com.tyh.feign.FeignProvideClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tyh.entity.student;
import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignHandler {

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
