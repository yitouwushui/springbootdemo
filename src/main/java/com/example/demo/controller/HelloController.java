package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author
 * @date 2017/11/24
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello,this is a springboot demo";
    }

}
