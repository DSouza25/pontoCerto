package com.example.pontocerto.services;

import com.example.pontocerto.domain.User;
import com.example.pontocerto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void saveNewUser(User user){
        User newUser = new User(null, "dario", user.getPassword(), user.getEmail());
        repository.save(newUser);
    }

    public String teste(){
        return "Funcionando bem demais";
    }
}
