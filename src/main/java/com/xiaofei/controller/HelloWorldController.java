package com.xiaofei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: xiaofei
 * Date: 2022-08-19, 19:07
 * Description:
 */
@RestController
@RequestMapping("/api")
public class HelloWorldController {
    @RequestMapping("/hi")
    public String sayHi(String username){
        return "welcome aboard, "+username+"!!!";
    }
}
