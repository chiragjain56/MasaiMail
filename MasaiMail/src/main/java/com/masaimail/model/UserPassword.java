package com.masaimail.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserPassword {

    @Id
    private String email;
    private String password;
}
