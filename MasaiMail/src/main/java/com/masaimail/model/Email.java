package com.masaimail.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String To;
   private String From;
   private boolean starred = false;
}
