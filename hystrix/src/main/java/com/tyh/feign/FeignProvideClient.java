package com.tyh.feign;

import com.tyh.entity.student;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider")
public interface FeignProvideClient {
    @GetMapping("/student/findAll")
    public Collection<student> findAll();
    @GetMapping("/student/index")
    public String index();

}
