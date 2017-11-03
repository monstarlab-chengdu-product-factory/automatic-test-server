/*
 * System Name    : XXXXX
 * SubSystem Name : Product
 * Class Name     : ZhangController
 * Description    : XXXXX
 */

package com.tdd.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Revision ：
 * Rev -- Date---------Name------------Note
 * 1.0    2017.11.03   MONSTAR-LAB-CN  Created
 */
@RestController
public class ZhangController {

    @RequestMapping("/zhang")
    public String zhang(@RequestParam("userId") String userId){
        return userId;
    }
}
