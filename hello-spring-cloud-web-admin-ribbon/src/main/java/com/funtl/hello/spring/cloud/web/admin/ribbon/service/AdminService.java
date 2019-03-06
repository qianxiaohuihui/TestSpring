package com.funtl.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String msg){
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hi?msg=" + msg, String.class);
    }

    //sayHi连不上时则返回这个结果,把服务ServiceAdminApplication停掉可看到效果
    public String hiError(String msg){
        return String.format("Hi, your message is : %s but request failed",msg);
    }
}
