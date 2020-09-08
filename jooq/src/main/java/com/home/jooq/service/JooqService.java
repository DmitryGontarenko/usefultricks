package com.home.jooq.service;

import com.home.jooq.dto.Author;
import com.home.jooq.dto.Book;

public interface JooqService {
    Author getAuthorByBook(String book);
    Book saveBook(String book);
}
