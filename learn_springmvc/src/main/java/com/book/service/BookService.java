package com.book.service;

import com.book.dao.BookDao;
import com.book.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void add(Book book) {
        bookDao.add(book);
    }

    public void update(Book book) {
        bookDao.update(book);
    }
}
