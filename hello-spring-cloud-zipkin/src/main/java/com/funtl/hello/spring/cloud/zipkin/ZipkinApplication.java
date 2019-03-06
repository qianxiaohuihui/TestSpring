package com.funtl.hello.spring.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
@EnableZipkinServer
public class ZipkinApplication {
    //这儿没调试出来，大概是版本和配置的原因，但我已经绝望了
    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }
}