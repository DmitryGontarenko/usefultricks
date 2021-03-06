/*
 * This file is generated by jOOQ.
 */
package com.home.jooq.db.autocreated;


import com.home.jooq.db.autocreated.tables.Author;
import com.home.jooq.db.autocreated.tables.AuthorBookCrs;
import com.home.jooq.db.autocreated.tables.Book;


/**
 * Convenience access to all tables in public
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * Таблица авторов
     */
    public static final Author AUTHOR = Author.AUTHOR;

    /**
     * Кросс таблица: авторы-книги
     */
    public static final AuthorBookCrs AUTHOR_BOOK_CRS = AuthorBookCrs.AUTHOR_BOOK_CRS;

    /**
     * Таблица книг
     */
    public static final Book BOOK = Book.BOOK;
}
