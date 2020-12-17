package com.anonymous.orange.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyun
 * @date 2020-12-17 15:56
 */
@RestController
@Slf4j
public class HelloWorldController {

    @GetMapping(value = "/test/hello")
    public String sayHello(){
        return "hello world!";
    }
}
