package com.example.app.item;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    private String clientId;

    private String firstLastname;
    private String gender;
    private String dateOfBirth;

    public Client() {
    }

    public Client(String clientId, String firstLastname, String gender, String dateOfBirth) {
        this.clientId = clientId;
        this.firstLastname = firstLastname;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getFirstLastname() {
        return firstLastname;
    }

    public void setFirstLastname(String firstLastname) {
        this.firstLastname = firstLastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
