package edu.ysu.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

/**
 * @auther xiaochen
 * @create 2022-08-10 9:13
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello(){
        System.out.println("Hello world!");
        return "HelloHello";
    }
}
