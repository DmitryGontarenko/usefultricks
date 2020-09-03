package com.home.feign;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FeignControllerTest {

    private final static String ROOT_URL = "http://localhost:8089";
    private final static String BODY = "/body";

    private RestTemplate restTemplate;

    @Before
    public void setUp() {
        restTemplate = new RestTemplate();
    }

    @Test
    public void getFeignStringTest() {
        Person person = new Person("July", "Friday");
        Person forObject = restTemplate.getForObject(ROOT_URL + BODY, Person.class);

        assertThat(forObject, is(person));
    }
}
