package com.oscarrecinos.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscarrecinos.api.models.DTO.AddEditContactDTO;
import com.oscarrecinos.api.models.entity.Contact;
import com.oscarrecinos.api.repository.ContactRepository;
import com.oscarrecinos.api.services.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public void addContact(AddEditContactDTO newContact) throws Exception {
        Contact contact = new Contact();
        contact.setName(newContact.getName());
        contact.setPhone(newContact.getPhone());

        contactRepository.save(contact);
        return;
    }

    @Override
    public List<Contact> getContact(String name) throws Exception {
        return contactRepository.findByName(name);
    }

    @Override
    public void editContact(Long id, AddEditContactDTO editedContact) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editContact'");
    }

    @Override
    public void deleteContact(Long id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteContact'");
    }

    @Override
    public List<Contact> getContacts() throws Exception {
        return contactRepository.findAll();
    }
    
}
