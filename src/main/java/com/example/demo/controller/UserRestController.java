package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/api/v1/user")
@RestController
public class UserRestController {

    @GetMapping()
    public String getUserId() {
        return "82106120";
    }
}
