/*
 * This file is generated by jOOQ.
 */
package com.home.jooq.db.autocreated.tables.records;


import com.home.jooq.db.autocreated.tables.AuthorBookCrs;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Кросс таблица: авторы-книги
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorBookCrsRecord extends UpdatableRecordImpl<AuthorBookCrsRecord> implements Record3<Long, Long, Long> {

    private static final long serialVersionUID = -1055310526;

    /**
     * Setter for <code>public.author_book_crs.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.author_book_crs.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.author_book_crs.author_id</code>. Идентификатор автора
     */
    public void setAuthorId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.author_book_crs.author_id</code>. Идентификатор автора
     */
    public Long getAuthorId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.author_book_crs.book_id</code>. Идентификатор книги
     */
    public void setBookId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.author_book_crs.book_id</code>. Идентификатор книги
     */
    public Long getBookId() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, Long, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuthorBookCrs.AUTHOR_BOOK_CRS.ID;
    }

    @Override
    public Field<Long> field2() {
        return AuthorBookCrs.AUTHOR_BOOK_CRS.AUTHOR_ID;
    }

    @Override
    public Field<Long> field3() {
        return AuthorBookCrs.AUTHOR_BOOK_CRS.BOOK_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getAuthorId();
    }

    @Override
    public Long component3() {
        return getBookId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getAuthorId();
    }

    @Override
    public Long value3() {
        return getBookId();
    }

    @Override
    public AuthorBookCrsRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuthorBookCrsRecord value2(Long value) {
        setAuthorId(value);
        return this;
    }

    @Override
    public AuthorBookCrsRecord value3(Long value) {
        setBookId(value);
        return this;
    }

    @Override
    public AuthorBookCrsRecord values(Long value1, Long value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthorBookCrsRecord
     */
    public AuthorBookCrsRecord() {
        super(AuthorBookCrs.AUTHOR_BOOK_CRS);
    }

    /**
     * Create a detached, initialised AuthorBookCrsRecord
     */
    public AuthorBookCrsRecord(Long id, Long authorId, Long bookId) {
        super(AuthorBookCrs.AUTHOR_BOOK_CRS);

        set(0, id);
        set(1, authorId);
        set(2, bookId);
    }
}
