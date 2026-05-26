package com.example.pontocerto.services;


import com.example.pontocerto.domain.model.Collaborator;
import com.example.pontocerto.repository.CollaboratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollaboratorService {
    @Autowired
    private CollaboratorRepository collaboratorRepository;

    public String saveNewCollaborator(Collaborator collaborator){
        try {
            collaboratorRepository.save(collaborator);
            return "Colaborador salvo com sucesso";
        }catch (Exception e){
            return "Erro ao salvar" + e;
        }
    }

    public List<Collaborator> findAllCollaborator(){
        return collaboratorRepository.findAll();
    }

    public Optional<Collaborator> findCollaboratorById(Long id){
        return collaboratorRepository.findById(id);
    }
}
