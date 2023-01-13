package com.masaimail.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SendDTO {
    private String sendTo;
    private String receivedFrom;
}
