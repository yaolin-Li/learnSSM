package com.lyl.learnservlet.controller;

import io.lettuce.core.dynamic.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class HelloController {
    @Value("${server.port}")
    String port;
    @PostMapping("/save")
    public String saveName(String name, HttpSession session) {
        session.setAttribute("name",name);
        return port;
    }
    @GetMapping("/get")
    public String getName(HttpSession session) {
        return port+":"+session.getAttribute("name").toString();
    }
}
