package com.home.jooq;

import com.home.jooq.dto.Author;
import com.home.jooq.exeptions.RestExceptionsMessages;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class JooqControllerTest {

    private final static String ROOT_URL = "http://localhost:8085/jooq";
    private final static String SELECT_BOOK = "/select/{book}";

    private RestTemplate restTemplate;

    @Before
    public void setUp() {
        restTemplate = new RestTemplate();
    }

    @Test
    public void getAuthorByBookTest() {
        Author author = new Author(2L, "Franklin", "Herbert");

        ResponseEntity<Author> response = restTemplate.exchange(
                ROOT_URL + SELECT_BOOK,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<Author>() {},
                "Dune"
        );

        assertThat(RestExceptionsMessages.ERROR_REST_INCORRECTRESPONSECODE.getMessage(), response.getStatusCode(), is(HttpStatus.OK));
        Author responseBody = response.getBody();
        assertThat(RestExceptionsMessages.ERROR_REST_BODYISEMPTY.getMessage(), responseBody, notNullValue());
        authorCheck(responseBody, author);
    }

    private void authorCheck(Author actual, Author expected) {
        assertThat(actual.getId(), is(expected.getId()));
        assertThat(actual.getFirstName(), is(expected.getFirstName()));
        assertThat(actual.getLastName(), is(expected.getLastName()));
    }
}
