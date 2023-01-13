package com.masaimail.services;

import com.masaimail.dto.SendDTO;

public interface EmailServices {

    public boolean sendEmail(SendDTO sendDTO);

    public boolean starEmail(Long id);
    public boolean deleteEmail(Long id);

}
