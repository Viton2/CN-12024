package com.cn.cntrabalho1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {


    @GetMapping
    public String homePage(){
        return "jogo_da_velha";
    }
}
