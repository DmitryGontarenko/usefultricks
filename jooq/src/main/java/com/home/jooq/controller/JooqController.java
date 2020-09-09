package com.home.jooq.controller;

import com.home.jooq.dto.Author;
import com.home.jooq.dto.Book;
import com.home.jooq.service.JooqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/jooq")
public class JooqController {

    @Autowired
    private JooqService jooqService;

    @RequestMapping(value = "/select/{book}", method = RequestMethod.GET)
    public Author getAuthorByBook(@PathVariable("book") String book) {
        return jooqService.getAuthorByBook(book);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Book saveBook(@RequestBody Book book) {
        return jooqService.saveBook(book);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void updateBook(@RequestBody Book book) {
        jooqService.updateBook(book);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteBookById(@PathVariable("id") Long id) {
        jooqService.deleteBookById(id);
    }
}
