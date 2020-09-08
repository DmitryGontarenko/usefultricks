package com.home.jooq.controller;

import com.home.jooq.dto.Author;
import com.home.jooq.dto.Book;
import com.home.jooq.service.JooqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/jooq")
public class JooqController {

    @Autowired
    private JooqService jooqService;

    @RequestMapping(value = "/select/{book}", method = RequestMethod.GET)
    public Author getAuthorByBook(@PathVariable("book") String book) {
        return jooqService.getAuthorByBook(book);
    }

    @RequestMapping(value = "/insert/{book}", method = RequestMethod.GET)
    public Book saveBook(@PathVariable("book") String book) {
        return jooqService.saveBook(book);
    }
}
