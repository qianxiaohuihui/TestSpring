package com.funtl.hello.spring.cloud.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;            //对应配置文件中的内容

    @RequestMapping(value = "hi" ,method = RequestMethod.GET)
    public String sayHi(String msg){
        return String.format("Hi, your message is : %s ,port :%s",msg,port);

        //  http://localhost:8762/hi?msg=测试
    }
}
