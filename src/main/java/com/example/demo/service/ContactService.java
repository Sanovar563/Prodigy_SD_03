package com.example.demo.service;

import java.util.List;
import java.util.Optional;



import com.example.demo.entity.Contact;





public interface ContactService {

    List<Contact> getAllContacts();

    Optional<Contact> getContactById(Long id);

    Contact saveContact(Contact contact);

    void deleteContact(Long id);
}
