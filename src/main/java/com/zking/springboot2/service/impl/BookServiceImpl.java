package com.zking.springboot2.service.impl;

import com.github.pagehelper.PageHelper;
import com.zking.springboot2.mapper.BookMapper;
import com.zking.springboot2.model.Book;
import com.zking.springboot2.service.IBookService;
import com.zking.springboot2.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public int insert(Book record) {
        return 0;
    }

    @Override
    public int insertSelective(Book record) {
        return 0;
    }

    @Override
    public Book selectByPrimaryKey(String bookId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Book record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Book record) {
        return 0;
    }

    @Override
    public List<Book> list(Book book, PageBean pageBean) {
        return bookMapper.list(book);
    }
}
