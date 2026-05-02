package com.example.pontocerto.services;

import com.example.pontocerto.domain.model.User;
import com.example.pontocerto.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public Optional<User> findByEmail(String email) {
        Optional<User> user = Optional.of(repository.findByEmail(email)
                .orElseThrow(() -> new EntityNotFoundException("não achei")));
        return  user;
    }

    public void saveNewUser(User user){
        User newUser = new User(null, "dario", user.getPassword(), user.getEmail());
        repository.save(newUser);
    }

    public String teste(){
        return "Funcionando bem demais";
    }
}
