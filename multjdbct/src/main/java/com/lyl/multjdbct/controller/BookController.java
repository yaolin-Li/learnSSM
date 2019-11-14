package com.lyl.multjdbct.controller;

import com.lyl.multjdbct.entity.Book;
import com.lyl.multjdbct.mapper.BookMapper;
import com.lyl.multjdbct.mapper2.BookMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BookController {
//    @Resource(name = "jdbcTemplateOne")
//    JdbcTemplate jdbcTemplateOne;
//    @Autowired
//    @Qualifier("jdbcTemplateTwo")
//    JdbcTemplate jdbcTemplateTwo;
//    @GetMapping("/test1")
//    public void test1() {
//        List<Book> books1 = jdbcTemplateOne.query("select * from book",
//                new BeanPropertyRowMapper<>(Book.class));
//        List<Book> books2 = jdbcTemplateTwo.query("select * from book",
//                new BeanPropertyRowMapper<>(Book.class));
//        System.out.println("books1:"+books1);
//        System.out.println("books2:"+books2);
//    }
    @Autowired
    BookMapper bookMapper;
    @Autowired
    BookMapper2 bookMapper2;
    @GetMapping("/test1")
    public void test1() {
        List<Book> books1 = bookMapper.getAllBooks();
        List<Book> books2 = bookMapper2.getAllBooks();
        System.out.println("books1:"+books1);
        System.out.println("books2:"+books2);
    }
}
