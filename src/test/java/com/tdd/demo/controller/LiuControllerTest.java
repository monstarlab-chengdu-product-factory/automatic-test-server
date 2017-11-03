package com.tdd.demo.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * create by liuyiqian
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LiuControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void test() throws Exception {
        Integer input = 1;
        String result = testRestTemplate.getForObject("/liu?input={input}", String.class, input);
        Assert.assertEquals(result, "hello");
    }
}
