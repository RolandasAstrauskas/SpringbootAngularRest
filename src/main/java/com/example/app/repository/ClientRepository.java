package com.example.app.repository;

import com.example.app.item.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {

    List<Client> findByClientId(String clientID);
    List<Client> findByDateOfBirth(String dateOfBirth);


}
