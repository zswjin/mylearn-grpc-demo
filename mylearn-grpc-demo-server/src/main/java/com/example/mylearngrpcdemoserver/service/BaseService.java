package com.example.mylearngrpcdemoserver.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class BaseService {

    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "00";
    }
}
