/*
 * System Name    : XXXXX
 * SubSystem Name : Product
 * Class Name     : KunController
 * Description    : XXXXX
 */

package com.tdd.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Revision ：
 * Rev -- Date---------Name------------Note
 * 1.0    2017.11.06   Kun.Luo  Created
 */
@RestController
public class KunController {

    @GetMapping("/kun.luo")
    public String testFunc(){
        return "Hello world!";
    }
}
