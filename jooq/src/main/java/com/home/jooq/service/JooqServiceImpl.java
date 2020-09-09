package com.home.jooq.service;

import com.home.jooq.dao.JooqDao;
import com.home.jooq.dto.Author;
import com.home.jooq.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JooqServiceImpl implements JooqService {

    @Autowired
    private JooqDao jooqDao;

    @Override
    public Author getAuthorByBook(String book) {
        return jooqDao.getAuthorByBook(book);
    }

    @Override
    @Transactional
    public Book saveBook(Book book) {
        return jooqDao.saveBook(book.getTitle());
    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        jooqDao.updateBook(book.getId(), book.getTitle());
    }

    @Override
    @Transactional
    public void deleteBookById(Long id) {
        jooqDao.deleteBook(id);
    }
}
