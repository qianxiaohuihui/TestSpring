package com.funtl.hello.spring.cloud.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceAdminApplication {

    //服务器提供者
    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminApplication.class);
    }
}
