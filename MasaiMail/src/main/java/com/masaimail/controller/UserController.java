package com.masaimail.controller;

import com.masaimail.dto.EmailDTO;
import com.masaimail.dto.LoginDTO;
import com.masaimail.dto.RegisterDTO;
import com.masaimail.model.Email;
import com.masaimail.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/masaimail")
public class UserController {

    @Autowired
    UserService userService;

    //Login user
    @PostMapping("/login")
    public ResponseEntity<?> loginUserHandler(@RequestBody LoginDTO loginDTO) {
        boolean login = userService.loginUser(loginDTO);
        return new ResponseEntity<>(login, HttpStatus.OK);
    }

    //Get all mails for a particular user
    @GetMapping("/mail")
    public ResponseEntity getAllMailsHandler(@RequestBody EmailDTO emailDTO) {
        List<Email> emails = userService.getAllMails(emailDTO);
        return emails != null ? new ResponseEntity<>(emails, HttpStatus.OK) :
                new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    //Get all starred mails for a particular user
    @GetMapping("/starred")
    public ResponseEntity getAllStarredMails(@RequestBody EmailDTO emailDTO) {
        List<Email> starredMail = userService.getAllStarredMails(emailDTO);
        return starredMail != null ? new ResponseEntity(starredMail, HttpStatus.OK) : new
                ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    //Updating a user
    @PutMapping("/masaimail/user")
    public ResponseEntity updateUser(@RequestBody RegisterDTO registerDTO) {
        boolean isUpdated = userService.updateUser(registerDTO);
        return isUpdated ? new ResponseEntity(HttpStatus.OK) : new
                ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
