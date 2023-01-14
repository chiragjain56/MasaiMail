package com.masaimail.controller;

import com.masaimail.dto.SendDTO;
import com.masaimail.services.EmailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/masaimail")
public class EmailController {

    @Autowired
    private EmailServices emailServices;

    // Send an email
    @PostMapping("/mail")
    public ResponseEntity<?> sendEmailHandler(@RequestBody SendDTO sendDTO) {
        boolean sent = emailServices.sendEmail(sendDTO);
        return new ResponseEntity<>(sent, HttpStatus.OK);
    }

    //star an email
    @PostMapping("/starred/{id}")
    public ResponseEntity<?> staredAnEmailHandler(@PathVariable Long id) {
        boolean starred = emailServices.starEmail(id);
        return new ResponseEntity<>(starred, HttpStatus.OK);
    }

    //Delete an email
    @PostMapping("/delete/{id}")
    public ResponseEntity deleteEmail(@PathVariable Long id) {
        boolean isDeleted = emailServices.deleteEmail(id);
        return isDeleted ? new ResponseEntity(HttpStatus.OK) : new
                ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
