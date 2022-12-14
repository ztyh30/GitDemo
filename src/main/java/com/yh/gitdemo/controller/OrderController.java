package com.yh.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    @GetMapping("/getOrder")
    public String getOrder(int orderId) {
        return "Order";
    }
    
    @GetMapping("/getOrderByName")
    public String getOrderByName(String name) {
        return "Order by name";
    }

    @GetMapping("/saveOrder")
    public String saveOrder(int id) {
        return "saveOrder";
    }

    @GetMapping("/getOrderByIds")
    public String getOrderByIds(List<Integer> ids) {
        return "Order by ids";
    }

    public String orderUtil() {
        return "修改Order工具类";
    }

    public List<String> getOrderList() {
        List<String> list = new ArrayList<>();
        return list;
    }
}
