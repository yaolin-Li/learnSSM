package com.lyl.crossdomain.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @PostMapping("/")
    public String addBook(String name) {
        System.out.println("addBook");
        return "receive:" + name;
    }
    @DeleteMapping("/{id}")
    public String deleteBookById(@PathVariable Long id) {
        System.out.println("deleteBookById");
        return String.valueOf(id);
    }
}
