package com.zc.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 *  1. 整合MyBatis-Plus
 *   <dependency>
 *     <groupId>com.baomidou</groupId>
 *     <artifactId>mybatis-plus-boot-starter</artifactId>
 *     <version>3.2.0</version>
 *   </dependency>
 *  2.配置
 *   配置数据源
 *     导入数据库驱动
 *      在application.yml 中配置数据源相关信息
 *   配置MyBatis-Plus
 *     使用MapperScan注解
 *
 *
 *  MyBatis-Plus 的逻辑删除
 *   配置全局的逻辑删除规则
 *   低版本要配置逻辑删除的组件Bean(3.1.1之前的版本)
 *   加上逻辑删除注解@TableLogic
 *
 */
@EnableDiscoveryClient
@MapperScan("com.zc.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
