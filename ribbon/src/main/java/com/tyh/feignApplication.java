package com.tyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class feignApplication {
    public static void main(String[] args) {
        SpringApplication.run(feignApplication.class,args);
    }
}
