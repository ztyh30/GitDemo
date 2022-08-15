package com.yh.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ztyh
 * @Description TODO
 * @Date 2022/8/15 23:35
 */
@RestController
public class UserController {

    @GetMapping("/findAll")
    public String queryUsers() {
        return "Users Json Date";
    }
}
