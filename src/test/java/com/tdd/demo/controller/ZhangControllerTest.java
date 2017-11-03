/*
 * System Name    : XXXXX
 * SubSystem Name : Product
 * Class Name     : ZhangControllerTest
 * Description    : XXXXX
 */

package com.tdd.demo.controller;

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
 * 1.0    2017.11.03   MONSTAR-LAB-CN  Created
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ZhangControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testZhang(){
        String rs = this.restTemplate.getForObject("/zhang?userId=ss", String.class);
        Assert.assertEquals(rs, "ss");
    }
}
