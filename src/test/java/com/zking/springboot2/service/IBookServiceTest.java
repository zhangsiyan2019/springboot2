package com.zking.springboot2.service;

import com.github.pagehelper.PageHelper;
import com.zking.springboot2.Springboot2Application;
import com.zking.springboot2.model.Book;
import com.zking.springboot2.util.PageBean;
import com.zking.szkspringbootstarter.service.ISmsService;
import com.zking.szkspringbootstarter.service.IWebLog;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= Springboot2Application.class)
public class IBookServiceTest {
    @Autowired
    private IBookService bookService;
    private Book book;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private ISmsService smsService;
    @Autowired
    private IWebLog webLog;

    @Before
    public void setUp() throws Exception {
        book=new Book();
    }

    @Test
    public void list() {
        smsService.send("123456","中国电信","尊敬的XX，你已欠费，请及时缴纳","小李");
        webLog.openLog();
//        PageBean pageBean=new PageBean();
//        pageBean.setRows(4);
//        List<Book> books = bookService.list(book,pageBean);
//        redisTemplate.opsForValue().set("testspringbootredis",books);
//        books=bookService.list(book,pageBean);
//        for (Book b : books) {
//            System.out.println(b);
//        }
//        System.out.println(pageBean);
    }
}