package com.example.pontocerto.domain.model;

import com.example.pontocerto.domain.enums.CheckInOrOut;
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
public class Register implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date timeStamp;

    @Column
    private CheckInOrOut typeCheck;

    @Column
    private User user;
}
