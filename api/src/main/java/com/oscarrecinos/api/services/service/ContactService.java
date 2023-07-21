package com.oscarrecinos.api.services.service;


import java.util.List;

import com.oscarrecinos.api.models.DTO.AddEditContactDTO;
import com.oscarrecinos.api.models.entity.Contact;

public interface ContactService {
    void addContact(AddEditContactDTO newContact) throws Exception;
    List<Contact> getContact(String name) throws Exception;
    void editContact(Long id, AddEditContactDTO editedContact) throws Exception;
    void deleteContact(Long id) throws Exception;
    List<Contact> getContacts() throws Exception;


    
}
