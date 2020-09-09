package com.home.jooq.service;

import com.home.jooq.dto.Author;
import com.home.jooq.dto.Book;

public interface JooqService {
    Author getAuthorByBook(String book);
    Book saveBook(Book book);
    void updateBook(Book book);
    void deleteBookById(Long id);
}
