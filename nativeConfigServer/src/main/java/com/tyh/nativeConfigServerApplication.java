package com.tyh;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class nativeConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(nativeConfigServerApplication.class,args);

    }
}
