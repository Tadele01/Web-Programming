package com.example.demo.john.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/examPage")
public class examPagecontroller {
    @GetMapping
    public static String examPage(){
        return "examPage";
    }
}
