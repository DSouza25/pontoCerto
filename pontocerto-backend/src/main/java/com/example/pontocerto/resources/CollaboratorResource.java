package com.example.pontocerto.resources;

import com.example.pontocerto.domain.model.Collaborator;
import com.example.pontocerto.services.CollaboratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/home")
public class CollaboratorResource {

    @Autowired
    private CollaboratorService collaboratorService;


    @PostMapping
    public void saveUser(@RequestBody Collaborator collaborator){
        System.out.println(collaboratorService.saveNewCollaborator(collaborator));
    }

    @GetMapping
    public List<Collaborator> findAll(){
        return collaboratorService.findAllCollaborator();
    }
}
