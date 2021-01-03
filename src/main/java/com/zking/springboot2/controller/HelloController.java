package com.zking.springboot2.controller;

import com.zking.springboot2.model.Book;
import com.zking.springboot2.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HelloController {

     @Autowired
     private IBookService bookService;
     @Autowired
     private RedisTemplate redisTemplate;
    @RequestMapping("/")
    public String hello(Model model){
        model.addAttribute("uname","admin");
        model.addAttribute("age",90);
        Object sb = redisTemplate.opsForValue().get("testspringbootredis");
            List<Book> books = bookService.list(null, null);
            redisTemplate.opsForValue().set("testspringbootredis",books);
        model.addAttribute("list",books);
        return "index";
    }
}
