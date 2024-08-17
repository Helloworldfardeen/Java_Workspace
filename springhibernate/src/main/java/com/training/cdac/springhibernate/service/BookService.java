package com.training.cdac.springhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.cdac.springhibernate.dao.BookDAO;
import com.training.cdac.springhibernate.model.Book;

@Service
@Transactional
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    public void saveBook(Book book) {
        bookDAO.saveBook(book);
    }

    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }
}

