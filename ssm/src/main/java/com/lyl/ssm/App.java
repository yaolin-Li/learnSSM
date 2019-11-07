package com.lyl.ssm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;

//@EnableAutoConfiguration:注解表示开启自动化配直.自动化配置之后会自动进行 Spring 和 SpringMVC 的配置
//@ComponentScan:进行包扫描.配置包扫描才能将 HelloController 注册到 SpringMVC 容器中
//也可以直接使用组合注解＠SpringBootApplication来代替＠EnableAutoConfiguration和@ComponentScan
@EnableCaching
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
