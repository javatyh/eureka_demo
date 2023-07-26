package com.tyh.feign;

import java.util.Collection;
import com.tyh.entity.student;
import com.tyh.feign.impl.feignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider",fallback = feignError.class)
public interface FeignProvideClient {
    @GetMapping("/student/findAll")
    public Collection<student> findAll();
    @GetMapping("/student/index")
    public String index();

}
