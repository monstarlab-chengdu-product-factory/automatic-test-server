package com.tdd.demo.controller;

import com.tdd.demo.dto.TestUserDto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IndexControlllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    //private MockMvc mockMvc;

//    @Before
//    public void setUp() throws Exception {
//        mockMvc = MockMvcBuilders.standaloneSetup(new IndexControlller()).build();
//    }

    @Test
    public void indexTest() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/index")
//                .accept(MediaType.APPLICATION_JSON_UTF8))
//            .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().json("username").equals("zhangsan"))
//            .andDo(MockMvcResultHandlers.print())
//            .andReturn();
        TestUserDto testUserDto = this.restTemplate.getForObject("/index", TestUserDto.class);
        Assert.assertEquals(testUserDto.getUserName(), "zhangsan");
    }

}