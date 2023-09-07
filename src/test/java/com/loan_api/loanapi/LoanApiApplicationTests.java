package com.loan_api.loanapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.loan_api.loanapi.entity.Costumer;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
class LoanApiApplicationTests {
	@Autowired
	private WebTestClient webTestClient;

	@Test
	void sendCostumerSucess() {
		var customer = new Costumer(20, "123.654.789-00", "Maria Du", 5000.00, "SP");
		
		webTestClient.post()
		.uri("/customer-loans")
		.bodyValue(customer).exchange()
		.expectStatus().isOk()
		.expectBody()
		.jsonPath("$.length()").isEqualTo(2)
		.jsonPath("$.customerName").isEqualTo(customer.getName())
		.jsonPath("$.loans").isArray()
		.jsonPath("$.loans[0].type").isEqualTo("PERSONAL")
		.jsonPath("$.loans[0].interest_rate").isEqualTo(4)
		.jsonPath("$.loans[1].type").isEqualTo("CONSIGNNENT")
		.jsonPath("$.loans[1].interest_rate").isEqualTo(2)
		.jsonPath("$.loans[2].type").isEqualTo("GUARANTEED")
		.jsonPath("$.loans[2].interest_rate").isEqualTo(3);
	}

	
	@Test
	void sendCostumerFailure() {
		
		webTestClient.post()
		.uri("/customer-loans")
		.bodyValue(new Costumer(null, "", "", null, ""))
		.exchange()
		.expectStatus()
		.isBadRequest();
	}


}
