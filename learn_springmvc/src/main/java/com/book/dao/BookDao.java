package com.book.dao;

import com.book.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {

    //模拟数据库操作
    public void add(Book book){
        System.out.println("Method:Add\n");
    }
    public void update(Book book){
        System.out.println("Method:Update\n");
    }
}