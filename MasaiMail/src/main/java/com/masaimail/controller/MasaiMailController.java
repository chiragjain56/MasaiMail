package com.masaimail.controller;

import com.masaimail.services.EmailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/masaimail")
public class MasaiMailController {

    @Autowired
    private EmailServices emailServices;

}
