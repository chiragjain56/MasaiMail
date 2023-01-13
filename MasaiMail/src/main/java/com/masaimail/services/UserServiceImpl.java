package com.masaimail.services;

import com.masaimail.dto.EmailDTO;
import com.masaimail.dto.LoginDTO;
import com.masaimail.dto.RegisterDTO;
import com.masaimail.model.Email;
import com.masaimail.model.User;
import com.masaimail.model.UserPassword;
import com.masaimail.repository.UserPasswordRepo;
import com.masaimail.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    UserPasswordRepo userPasswordRepo;

    @Override
    public boolean registerUser(RegisterDTO registerDTO) {
        return false;
    }

    @Override
    public boolean loginUser(LoginDTO loginDTO) {
        List<UserPassword> users = userPasswordRepo.findAll();
        for (UserPassword user : users) {
            if ((user.getEmail().equals(loginDTO.getEmail())) && (user.getPassword().equals(loginDTO.getPassword())))
                return true;
        }
        return false;

    }

    @Override
    public List<Email> getAllMails(EmailDTO emailDTO) {
        List<User> users = userRepo.findAll();
        for (User user : users) {
            if (user.getEmail().equals(emailDTO.getEmail())) {
                return user.getEmails();
            }
        }
        return null;
    }

    @Override
    public List<Email> getAllStarredMails(EmailDTO emailDTO) {
        List<User> users = userRepo.findAll();
        List<Email> emails = null;
        List<Email> starredEmails = new ArrayList<>();
        for (User user : users) {
            if (user.getEmail().equals(emailDTO.getEmail()))
                emails = user.getEmails();
        }
        for (Email email : emails) {
            if (email.isStarred())
                starredEmails.add(email);
        }
        return starredEmails;
    }

    @Override
    public boolean updateUser(RegisterDTO registerDTO) {
        List<User> users = userRepo.findAll();
        User updatedUser = null;
        for (User user : users) {
            if (user.getEmail().equals(registerDTO.getEmail())) {
                updatedUser = user;
            }
        }
        updatedUser.setFirstName(registerDTO.getFirstName());
        updatedUser.setLastName(registerDTO.getLastName());
        updatedUser.setMobileNumber(registerDTO.getMobileNumber());
        updatedUser.setDateOfBirth(registerDTO.getDateOfBirth());
        userRepo.save(updatedUser);
        return true;
    }
}
