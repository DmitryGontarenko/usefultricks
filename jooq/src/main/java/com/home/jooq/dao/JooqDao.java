package com.home.jooq.dao;

import com.home.jooq.dto.Author;
import com.home.jooq.dto.Book;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.home.jooq.db.autocreated.Sequences.BOOK_SEQ;
import static com.home.jooq.db.autocreated.Tables.*;
import static com.home.jooq.db.autocreated.Tables.AUTHOR_BOOK_CRS;

@Repository
public class JooqDao {

    @Autowired
    private DSLContext dslContext;

    /**
     * Маппер полей, используемых в DTO слое Author
     */
    private static final RecordMapper<Record, Author> AUTHOR_MAPPER =
            record -> {
                Author author = new Author();
                author.setId(record.getValue(AUTHOR.ID));
                author.setFirstName(record.getValue(AUTHOR.FIRST_NAME));
                author.setLastName(record.getValue(AUTHOR.LAST_NAME));

                return author;
            };

    /**
     * Маппер полей, используемых в DTO слое Book
     */
    private static final RecordMapper<Record, Book> BOOK_MAPPER =
            new RecordMapper<Record, Book>() {
                @Override
                public Book map(Record record) {
                    Book book = new Book();
                    book.setId(record.getValue(BOOK.ID));
                    book.setTitle(record.getValue(BOOK.TITLE));

                    return book;
                }
            };

    /**
     * Создает запись новой книги в таблице Book
     * @param book Наименование книги
     */
    public Book saveBook(String book) {
        Long bookNextval = dslContext.nextval(BOOK_SEQ);

        dslContext.insertInto(BOOK)
                .set(BOOK.ID, bookNextval)
                .set(BOOK.TITLE, book)
                .execute();

        return getBookById(bookNextval);
    }

    /**
     * Возвращает список книг
     */
    public List<Book> getBooks() {
        return dslContext.select(
                BOOK.ID,
                BOOK.TITLE)
                .from(BOOK)
                .fetch(BOOK_MAPPER);
    }

    /**
     * Возвращает книгу
     */
    private Book getBookById(Long id) {
        return dslContext.select(
                BOOK.ID,
                BOOK.TITLE)
                .from(BOOK)
                .where(BOOK.ID.eq(id))
                .fetchOne(BOOK_MAPPER);
    }

    /**
     * Возвращает Автора по наименованию
     * написанной им книги
     *
     * @param book наименование книги
     */
    public Author getAuthorByBook(String book) {
        return dslContext.select(
                AUTHOR.ID,
                AUTHOR.FIRST_NAME,
                AUTHOR.LAST_NAME)
                .from(AUTHOR)
                .join(AUTHOR_BOOK_CRS).on(AUTHOR_BOOK_CRS.AUTHOR_ID.eq(AUTHOR.ID))
                .join(BOOK).on(BOOK.ID.eq(AUTHOR_BOOK_CRS.BOOK_ID))
                .where(BOOK.TITLE.eq(book))
                .fetchOne(AUTHOR_MAPPER);
    }

    /**
     * Обновления наименование книги по идентификатору таблицы
     * @param id идентификатор книги
     * @param newBook // наименование книги
     */
    public void updateBook(Long id, String newBook) {
        dslContext.update(BOOK)
                .set(BOOK.TITLE, newBook)
                .where(BOOK.ID.eq(id))
                .execute();
    }

    /**
     * Удаление записи книги по идентификатору
     * @param id ижентификатор
     */
    public void deleteBook(Long id) {
        dslContext.delete(BOOK)
                .where(BOOK.ID.eq(id))
                .execute();
    }
}
