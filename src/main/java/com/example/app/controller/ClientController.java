package com.example.app.controller;

import com.example.app.item.Client;
import com.example.app.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {

    @Autowired
    private ClientService clientService;


    @GetMapping("/client/id/{clientId}")
    public List<Client> findClient(@RequestParam("clientId") String clientId){
        return  clientService.findClientById(clientId);
    }

    @GetMapping("/client/{dateOfBirth}")
    public List<Client> findClientByDateOfBirth(@RequestParam("dateOfBirth") String dateOfBirth){
        return clientService.findClientByDateOfBirth(dateOfBirth);
    }

    //DATABASE Check
    @GetMapping("/all")
    public List<Client> findAll(){
        return clientService.findAll();
    }
}
