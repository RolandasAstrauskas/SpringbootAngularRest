package com.example.app.service;

import com.example.app.repository.ClientRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
class ClientServiceIntegrationTest {



    @TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {

        @Bean
        public ServiceInterface serviceInterface() {
            return new ClientService();
        }
    }

    @Autowired
    private ClientService clientService;

    @MockBean
    private ClientRepository clientRepository;

    @Before
    public void setUp() {
//        Client client = new Client("12345678912", "test", "1990-10-10", "test");
       // List<Client> clientList= clientRepository.findByClientId(client.getClientId());
//        Mockito.when(
//                client)
//                .thenReturn(client);
    }

    @Test
    public void byIdClientShouldBeFound() {
//        String clientId = "12345678912";
//        List<Client> clientList= clientService.findClientById(clientId);
//        Client found = clientList.get(0);
//
//        Assertions.assertEquals(found.getClientId(), clientId);
    }


}