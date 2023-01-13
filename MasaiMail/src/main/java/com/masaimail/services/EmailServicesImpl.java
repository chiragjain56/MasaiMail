package com.masaimail.services;

import com.masaimail.dto.SendDTO;
import com.masaimail.model.Email;
import com.masaimail.repository.EmailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmailServicesImpl {

    @Autowired
    EmailRepo emailRepo;

    public boolean sendEmail(SendDTO sendDTO){
        Email email = new Email();
        email.setSendTo(sendDTO.getSendTo());
     email.setSendTo(sendDTO.getReceivedFrom());
        emailRepo.save(email);
        return true;
    }



}
