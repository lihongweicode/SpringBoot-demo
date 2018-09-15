package com.model.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellow")
public class HellowController {
    @GetMapping("/")
    public String hellow(){
        return "Hellow word";
    }
}
