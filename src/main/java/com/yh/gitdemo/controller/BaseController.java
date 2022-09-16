package com.yh.gitdemo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class BaseController {
    @GetMapping("/basecontroller")
    public String baseController() {
        return "base controller";
    }
}
