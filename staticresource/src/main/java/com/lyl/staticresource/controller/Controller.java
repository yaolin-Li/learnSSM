package com.lyl.staticresource.controller;

import com.lyl.staticresource.entity.Author;
import com.lyl.staticresource.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@RestController
public class Controller {
    @GetMapping("/hello")
    @ResponseBody
    public void hello(Model model) {
        Map<String, Object> map = model.asMap();
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Object value = map.get(key);
            System.out.println(key + ">>>" +value);
        }
    }

    @GetMapping("/book")
    @ResponseBody
    public String book(@ModelAttribute("b") Book book, @ModelAttribute("a")Author author) {
        return book.toString() +">>>" +author.toString();
    }

}
