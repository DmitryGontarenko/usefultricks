/*
 * This file is generated by jOOQ.
 */
package com.home.jooq.db.autocreated.tables;


import com.home.jooq.db.autocreated.Keys;
import com.home.jooq.db.autocreated.Public;
import com.home.jooq.db.autocreated.tables.records.AuthorRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Таблица авторов
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Author extends TableImpl<AuthorRecord> {

    private static final long serialVersionUID = 1960915984;

    /**
     * The reference instance of <code>public.author</code>
     */
    public static final Author AUTHOR = new Author();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthorRecord> getRecordType() {
        return AuthorRecord.class;
    }

    /**
     * The column <code>public.author.id</code>. Идентификатор автора
     */
    public final TableField<AuthorRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "Идентификатор автора");

    /**
     * The column <code>public.author.first_name</code>. Имя
     */
    public final TableField<AuthorRecord, String> FIRST_NAME = createField(DSL.name("first_name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "Имя");

    /**
     * The column <code>public.author.last_name</code>. Фамилия
     */
    public final TableField<AuthorRecord, String> LAST_NAME = createField(DSL.name("last_name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "Фамилия");

    /**
     * Create a <code>public.author</code> table reference
     */
    public Author() {
        this(DSL.name("author"), null);
    }

    /**
     * Create an aliased <code>public.author</code> table reference
     */
    public Author(String alias) {
        this(DSL.name(alias), AUTHOR);
    }

    /**
     * Create an aliased <code>public.author</code> table reference
     */
    public Author(Name alias) {
        this(alias, AUTHOR);
    }

    private Author(Name alias, Table<AuthorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Author(Name alias, Table<AuthorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица авторов"), TableOptions.table());
    }

    public <O extends Record> Author(Table<O> child, ForeignKey<O, AuthorRecord> key) {
        super(child, key, AUTHOR);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<AuthorRecord> getPrimaryKey() {
        return Keys.PK_AUTHOR_ID;
    }

    @Override
    public List<UniqueKey<AuthorRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthorRecord>>asList(Keys.PK_AUTHOR_ID);
    }

    @Override
    public Author as(String alias) {
        return new Author(DSL.name(alias), this);
    }

    @Override
    public Author as(Name alias) {
        return new Author(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Author rename(String name) {
        return new Author(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Author rename(Name name) {
        return new Author(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
