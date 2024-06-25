package com.example.mylearngrpcdemoclient.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class BaseController {

    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "00";
    }
}
