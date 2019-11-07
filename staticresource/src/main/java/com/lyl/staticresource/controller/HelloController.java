package com.lyl.staticresource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hei")
    public String hello() {
        int i = 1 / 0;
        return "hello";
    }
}
