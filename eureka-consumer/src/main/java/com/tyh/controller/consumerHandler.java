package com.tyh.controller;


import com.tyh.entity.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/consumer")
public class consumerHandler {

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/findAll")
    public Collection<student> findAll(){
        return restTemplate.getForEntity("http://localhost:8010/student/findAll", Collection.class).getBody();
    }
    @GetMapping("/findAll2")
    public Collection<student> findAll2(){
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }
    @GetMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id")  Long id){//这个注解是把url中的参数映射过来
        restTemplate.getForObject("http://localhost:8010/student/deleteById/{id}",null,id);
    }
    @GetMapping("/fingById/{id}")
    public student findById(@PathVariable("id") Long id){
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}",student.class,id);
    }
    @PostMapping("/save")
    public void save(@RequestBody student student){
        restTemplate.postForObject("http://localhost:8010/student/save",student,null);
    }
}
