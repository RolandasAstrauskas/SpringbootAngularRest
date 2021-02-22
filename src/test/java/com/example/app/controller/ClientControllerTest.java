package com.example.app.controller;

import com.example.app.item.Client;
import com.example.app.service.ClientService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ClientController.class)
class ClientControllerTest {


    @Autowired
    private MockMvc mvc;

    @MockBean
    private ClientService service;


    @Test
    public void findAll()
            throws Exception {

        Client client = new Client("12345678912", "test", "1990-10-10", "test");
        List<Client> clientList = Collections.singletonList(client);

        given(service.findAll()).willReturn(clientList);
        mvc.perform(get("/all")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)));
    }



    @Test
    void testFindClient() {
    }

    @Test
    void testFindClientByDateOfBirth() {
    }
}