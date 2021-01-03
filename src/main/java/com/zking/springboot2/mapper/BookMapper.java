package com.zking.springboot2.mapper;

import com.zking.springboot2.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> list(Book book);
}