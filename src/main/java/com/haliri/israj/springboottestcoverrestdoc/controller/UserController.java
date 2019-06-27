package com.haliri.israj.springboottestcoverrestdoc.controller;

import com.haliri.israj.springboottestcoverrestdoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public Map getHelloWorld() {
        Map map = new HashMap();
        map.put("data", userService.findAll());
        map.put("status", HttpStatus.OK);

        return map;
    }
}
