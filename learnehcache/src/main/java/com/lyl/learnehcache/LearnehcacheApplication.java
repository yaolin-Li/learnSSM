package com.lyl.learnehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class LearnehcacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnehcacheApplication.class, args);
    }

}
