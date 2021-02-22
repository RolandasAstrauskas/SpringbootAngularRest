package com.example.app.repository;

import com.example.app.item.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
class ClientRepositoryIntegrationTest {


    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ClientRepository clientRepository;



    @Test
    void findByClientId() {
        Client client = new Client("12345678912", "test", "1990-10-10", "test");
        entityManager.persist(client);
        entityManager.flush();
        List<Client> clientList = clientRepository.findByClientId(client.getClientId());
        Client found = clientList.get(0);
        Assertions.assertEquals(found.getClientId(), client.getClientId());
    }


    @Test
    void findByDateOfBirth() {
        Client client = new Client("12345678912", "test", "1990-10-10", "test");
        entityManager.persist(client);
        entityManager.flush();
        List<Client> clientList = clientRepository.findByDateOfBirth(client.getDateOfBirth());
        Client found = clientList.get(0);
        Assertions.assertEquals(found.getDateOfBirth(), client.getDateOfBirth());
    }
}