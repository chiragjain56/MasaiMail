package com.masaimail.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDTO {

    private String email;
    private  String firstName;
    private  String lastName;
    private  Long mobileNumber;
    private LocalDate dateOfBirth;
    private String password;
}
