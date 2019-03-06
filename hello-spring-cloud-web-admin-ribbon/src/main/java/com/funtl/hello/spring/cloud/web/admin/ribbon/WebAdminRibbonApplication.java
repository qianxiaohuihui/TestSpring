package com.funtl.hello.spring.cloud.web.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class WebAdminRibbonApplication {
/**
    服务器消费者
    可看到负载均衡效果      http://localhost:8764/hi?msg=44444

     一个服务注册中心，Eureka Server，端口号为：8761
     service-admin 工程运行了两个实例，端口号分别为：8762，8763
     web-admin-ribbon 工程端口号为：8764
     web-admin-ribbon 通过 RestTemplate 调用 service-admin 接口时因为启用了负载均衡功能故会轮流调用它的 8762 和 8763 端口
*/
    public static void main(String[] args) {
        SpringApplication.run(WebAdminRibbonApplication.class);
    }
}
