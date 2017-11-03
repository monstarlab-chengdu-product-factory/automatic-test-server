package com.tdd.demo.controller;

import com.tdd.demo.dto.TestUserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexControlller {

    @GetMapping
    public TestUserDto index() {
        TestUserDto testUserDto = new TestUserDto();
        testUserDto.setUserName("zhangsan");
        testUserDto.setAge(18);
        return testUserDto;
    }


}
