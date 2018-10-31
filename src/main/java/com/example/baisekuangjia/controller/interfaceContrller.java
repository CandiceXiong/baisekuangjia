package com.example.baisekuangjia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class interfaceContrller {
    @RequestMapping("/index")
    public String index()
    {
        return "hh";
    }
}
