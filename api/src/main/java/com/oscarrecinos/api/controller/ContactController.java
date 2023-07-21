package com.oscarrecinos.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oscarrecinos.api.models.DTO.AddEditContactDTO;
import com.oscarrecinos.api.models.entity.Contact;
import com.oscarrecinos.api.services.service.ContactService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping(value="/get-contacts")
    public ResponseEntity<?> getContacts() throws Exception {
        List<Contact> contacts = contactService.getContacts();

        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping(value="/get-contacts/{name}")
    public ResponseEntity<?> getContactsByName(@PathVariable String name) throws Exception {
        List<Contact> contacts = contactService.getContact(name);
|
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }
    

    @PostMapping("/add-contact")
    public ResponseEntity<?> postMethodName(@RequestBody @Valid AddEditContactDTO newContact) throws Exception {
        contactService.addContact(newContact);
        
        return new ResponseEntity<>(newContact,HttpStatus.CREATED);
    }


    
    
    

}
