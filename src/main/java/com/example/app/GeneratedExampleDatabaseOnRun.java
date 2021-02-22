package com.example.app;

import com.example.app.item.Client;
import com.example.app.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GeneratedExampleDatabaseOnRun implements CommandLineRunner {

    private Client client;

    @Autowired
    private ClientRepository clientRepository;


    //Example data for database
    @Override
    public void run(String... args) throws Exception {

        for(int i = 0; i < 10; i++){
            client = new Client("3912132131"+i, "test", "male", "1990-10-10");
            clientRepository.save(client);
        }
        for(int i = 11; i < 20; i++){
            client = new Client("3912132131"+i, "test", "male", "1990-10-15");
            clientRepository.save(client);
        }
        System.out.println("Data loaded!");
    }
}
