package com.example.app.service;

import com.example.app.repository.ClientRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class ClientServiceTest {

    @InjectMocks
    private ClientService clientService;

    @Mock
    private ClientRepository clientRepository;


    @Test
    void findClientById() {
//        when(clientRepository.findAll()).thenReturn( new Client("12345678912", "test", "1990-10-10", "test"));
       // Client client = clientService.findClientById("12345678912");
//        Assertions.assertEquals("12345678912", client.getClientId());
//        Assertions.assertEquals("test", client.getFirstLastname());
//        Assertions.assertEquals("1990-10-10", client.getDateOfBirth());
//        Assertions.assertEquals("test", client.getGender());
    }

    @Test
    void findClientByDateOfBirth() {
    }
}