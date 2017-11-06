package com.tdd.demo.controller;

/*
 * System Name    : XXXXX
 * SubSystem Name : Product
 * Class Name     : KunControllerTest
 * Description    : XXXXX
 */
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Revision ：
 * Rev -- Date---------Name------------Note
 * 1.0    2017.11.06   Kun.Luo  Created
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class KunControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testKun(){
        String rs = this.restTemplate.getForObject("/kun.luo", String.class);
        Assert.assertEquals(rs, "Hello world!");
    }
}
