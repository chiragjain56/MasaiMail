package com.masaimail.services;

import com.masaimail.dto.EmailDTO;
import com.masaimail.dto.LoginDTO;
import com.masaimail.dto.RegisterDTO;
import com.masaimail.model.Email;

import java.util.List;

public interface UserService {

    public boolean registerUser(RegisterDTO registerDTO);

    public boolean loginUser(LoginDTO loginDTO);

    public List<Email> getAllMails(EmailDTO emailDTO);

    public List<Email> getAllStarredMails(EmailDTO emailDTO);

    public boolean updateUser(RegisterDTO registerDTO);
}
