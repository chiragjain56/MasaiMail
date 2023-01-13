package com.masaimail.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class User {
    @Id
    private String email;
    private  String firstName;
    private  String lastName;
    private  int mobileNumber;
    private LocalDate dateOfBirth;

    @OneToMany
    private  List<Email> emails = new ArrayList<>() ;


}
