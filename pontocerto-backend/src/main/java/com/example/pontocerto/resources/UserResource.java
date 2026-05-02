package com.example.pontocerto.resources;

import com.example.pontocerto.domain.model.User;
import com.example.pontocerto.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
    public User loginValidation(@RequestBody User user){
        Optional<User> usuario =  userService.findByEmail(user.getEmail());
        System.out.println(usuario.getClass());
        return usuario.get();
    }

    public void saveUser(@RequestBody User user){
        userService.saveNewUser(user);
    }
}
