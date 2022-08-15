package com.yh.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ztyh
 * @Description TODO
 * @Date 2022/8/15 23:24
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "Hello World";
    }
}
