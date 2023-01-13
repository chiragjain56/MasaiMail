package com.masaimail.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class User {
    @OneToMany
    public List<Email> emails;
    @Id
    private String email;
    private String firstName;
    private String lastName;
    private Long mobileNumber;
    private LocalDate dateOfBirth;

}
