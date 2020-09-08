/*
 * This file is generated by jOOQ.
 */
package com.home.jooq.db.autocreated.tables.records;


import com.home.jooq.db.autocreated.tables.Book;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица книг
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookRecord extends UpdatableRecordImpl<BookRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = -609791601;

    /**
     * Setter for <code>public.book.id</code>. Идентификатор книги
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.book.id</code>. Идентификатор книги
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.book.title</code>. Наименование книги
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.book.title</code>. Наименование книги
     */
    public String getTitle() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Book.BOOK.ID;
    }

    @Override
    public Field<String> field2() {
        return Book.BOOK.TITLE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getTitle();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getTitle();
    }

    @Override
    public BookRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public BookRecord value2(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public BookRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BookRecord
     */
    public BookRecord() {
        super(Book.BOOK);
    }

    /**
     * Create a detached, initialised BookRecord
     */
    public BookRecord(Long id, String title) {
        super(Book.BOOK);

        set(0, id);
        set(1, title);
    }
}