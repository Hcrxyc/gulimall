package com.zc.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 想远程调用别的服务
 *   引用open-feign
 *   编写一个接口，告诉SpringCloud这个接口需要调用远程服务
 *     声明接口的每一个方法都是调用哪个远程服务的请求
 *     开启远程调用的功能
 *       @EnableFeignClients
 */
@EnableFeignClients(basePackages = "com.zc.gulimall.member.fegin")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
