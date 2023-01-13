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
   private String sendTo;
   private String receivedFrom;
   private boolean starred = false;
}
