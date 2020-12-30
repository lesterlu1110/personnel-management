package com.priv.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:
 * @Description:
 * @Author: CaoTao
 * @Create: 2020/12/30
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello World";
    }

}
