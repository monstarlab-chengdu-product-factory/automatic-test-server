package com.tdd.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by liuyiqian
 */
@RestController
@RequestMapping("/liu")
public class LiuController {

    public static final Integer VALUE = 1;

    @GetMapping
    public String test(Integer input) {
        if(input == VALUE) {
            return "hello";
        }
        return "bye";
    }
}
