package com.example.app.service;

import com.example.app.item.Client;

import java.util.List;

public interface ServiceInterface {

    Object findClientById(String clientId);
    List<Client> findClientByDateOfBirth(String dateOfBirth);
    List<Client> findAll();

}
