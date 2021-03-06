/*
 * This file is generated by jOOQ.
 */
package com.home.jooq.db.autocreated;


import com.home.jooq.db.autocreated.tables.Author;
import com.home.jooq.db.autocreated.tables.AuthorBookCrs;
import com.home.jooq.db.autocreated.tables.Book;
import com.home.jooq.db.autocreated.tables.records.AuthorBookCrsRecord;
import com.home.jooq.db.autocreated.tables.records.AuthorRecord;
import com.home.jooq.db.autocreated.tables.records.BookRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> PK_AUTHOR_ID = UniqueKeys0.PK_AUTHOR_ID;
    public static final UniqueKey<AuthorBookCrsRecord> PK_AUTHOR_BOOK_CRS_ID = UniqueKeys0.PK_AUTHOR_BOOK_CRS_ID;
    public static final UniqueKey<BookRecord> PK_BOOK_ID = UniqueKeys0.PK_BOOK_ID;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AuthorBookCrsRecord, AuthorRecord> AUTHOR_BOOK_CRS__FK_AUTHOR_BOOK_CRS_AUTHOR = ForeignKeys0.AUTHOR_BOOK_CRS__FK_AUTHOR_BOOK_CRS_AUTHOR;
    public static final ForeignKey<AuthorBookCrsRecord, BookRecord> AUTHOR_BOOK_CRS__FK_AUTHOR_BOOK_CRS_BOOK = ForeignKeys0.AUTHOR_BOOK_CRS__FK_AUTHOR_BOOK_CRS_BOOK;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<AuthorRecord> PK_AUTHOR_ID = Internal.createUniqueKey(Author.AUTHOR, "pk_author_id", new TableField[] { Author.AUTHOR.ID }, true);
        public static final UniqueKey<AuthorBookCrsRecord> PK_AUTHOR_BOOK_CRS_ID = Internal.createUniqueKey(AuthorBookCrs.AUTHOR_BOOK_CRS, "pk_author_book_crs_id", new TableField[] { AuthorBookCrs.AUTHOR_BOOK_CRS.ID }, true);
        public static final UniqueKey<BookRecord> PK_BOOK_ID = Internal.createUniqueKey(Book.BOOK, "pk_book_id", new TableField[] { Book.BOOK.ID }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<AuthorBookCrsRecord, AuthorRecord> AUTHOR_BOOK_CRS__FK_AUTHOR_BOOK_CRS_AUTHOR = Internal.createForeignKey(Keys.PK_AUTHOR_ID, AuthorBookCrs.AUTHOR_BOOK_CRS, "fk_author_book_crs_author", new TableField[] { AuthorBookCrs.AUTHOR_BOOK_CRS.AUTHOR_ID }, true);
        public static final ForeignKey<AuthorBookCrsRecord, BookRecord> AUTHOR_BOOK_CRS__FK_AUTHOR_BOOK_CRS_BOOK = Internal.createForeignKey(Keys.PK_BOOK_ID, AuthorBookCrs.AUTHOR_BOOK_CRS, "fk_author_book_crs_book", new TableField[] { AuthorBookCrs.AUTHOR_BOOK_CRS.BOOK_ID }, true);
    }
}
