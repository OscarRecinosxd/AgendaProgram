package com.oscarrecinos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oscarrecinos.api.models.entity.Contact;
import java.util.List;


@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{
    
    List<Contact> findByName(String name);
    
}
