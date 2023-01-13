package com.masaimail.services;

import com.masaimail.dto.SendDTO;
import com.masaimail.model.Email;
import com.masaimail.repository.EmailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmailServicesImpl implements EmailServices {

    @Autowired
    EmailRepo emailRepo;

    @Override
    public boolean sendEmail(SendDTO sendDTO) {
        Email email = new Email();
        email.setTo(sendDTO.getSendTo());
        email.setTo(sendDTO.getReceivedFrom());
        emailRepo.save(email);
        return true;
    }

    @Override
    public boolean starEmail(Long id) {
        Email email = emailRepo.getReferenceById(id);
        email.setStarred(true);
        emailRepo.save(email);
        return true;
    }

    @Override
    public boolean deleteEmail(Long id) {
        emailRepo.deleteById(id);
        return true;
    }
}
