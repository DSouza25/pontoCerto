package com.example.pontocerto.resources;

import com.example.pontocerto.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/teste")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public String teste(){
        return userService.teste();
    }
}
