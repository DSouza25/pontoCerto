package com.example.pontocerto.resources;

import com.example.pontocerto.domain.User;
import com.example.pontocerto.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void pegarDados(@RequestBody User obj){
        System.out.println(obj.getName());
    }
}
