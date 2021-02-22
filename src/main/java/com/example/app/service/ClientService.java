package com.example.app.service;

import com.example.app.item.Client;
import com.example.app.repository.ClientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService implements ServiceInterface{

    final Logger logger = LoggerFactory.getLogger(ClientService.class);



    @Autowired
    private ClientRepository clientRepository;



    public List<Client> findClientById(String clientId) {
        logger.info("Searching for the client by id");
        if(clientId.length() != 11){
            logger.warn("Client insert to short id");

        } else if(clientRepository.findByClientId(clientId) == null){
            logger.warn("Id didn't match to any id from database!");

        }
        logger.info("Id founded successful!");
        return clientRepository.findByClientId(clientId);
    }

    @Override
    public List<Client> findClientByDateOfBirth(String dateOfBirth) {
        logger.info("Searching for the client by date of birth");
        List<Client> clientList = clientRepository.findAll();
        List<Client> clientListMatch = new ArrayList<>();

        for (Client client : clientList) {
            if (client.getDateOfBirth().equals(dateOfBirth)){
                logger.info("Checking for  matching date of birth from database");
                clientListMatch.add(client);
            }
        }
        logger.info("Return founded list.");
        return clientListMatch;
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }


}
