package com.tyh.feign.impl;

import com.tyh.entity.student;
import com.tyh.feign.FeignProvideClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@Component
public class feignError implements FeignProvideClient {
    @Override
    public Collection<student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中";
    }
}
