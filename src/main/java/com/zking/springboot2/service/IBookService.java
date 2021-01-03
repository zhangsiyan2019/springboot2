package com.zking.springboot2.service;

import com.zking.springboot2.model.Book;
import com.zking.springboot2.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface IBookService {

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(String bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> list(Book book, PageBean pageBean);
}