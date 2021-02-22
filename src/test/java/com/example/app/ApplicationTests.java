package com.example.app;

import com.example.app.controller.ClientController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private ClientController clientController;

	@Test
	void contextLoads() {
		assertThat(clientController).isNotNull();
	}

}
