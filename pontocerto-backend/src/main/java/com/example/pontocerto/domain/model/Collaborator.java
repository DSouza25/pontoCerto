package com.example.pontocerto.domain.model;

import com.example.pontocerto.domain.enums.CollaboratorPosition;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class Collaborator implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column
    private Date dateOfBirth;

    @Column
    private String address;

    @Column
    private String phoneNumber;

    @Column(nullable = false)
    private User user;

    @Column(nullable = false)
    private CollaboratorPosition position;

    @Column
    private Store store;

}
