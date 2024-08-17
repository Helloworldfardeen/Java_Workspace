package com.training.cdac.springhibernate.dao;

import java.util.List;
import com.training.cdac.springhibernate.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
//import javax.transaction.Transactional;
//above no use
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
@Transactional
public class BookDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public void saveBook(Book book) {
        hibernateTemplate.save(book);
    }

    public List<Book> getAllBooks() {
        return hibernateTemplate.loadAll(Book.class);
    }
}


