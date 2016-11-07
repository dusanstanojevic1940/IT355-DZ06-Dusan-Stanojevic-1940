package com.it355.controllers;

import com.it355.dao.ContactDao;
import com.it355.models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
@RequestMapping("/admin")
public class Admin {
    @Autowired
    private MessageSource messageSource;

    @Autowired
    private ContactDao contactDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String findAll(ModelMap model) {
        return "adminindex";
    }
}