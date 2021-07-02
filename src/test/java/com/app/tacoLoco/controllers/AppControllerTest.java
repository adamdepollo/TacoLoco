package com.app.tacoLoco.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class AppControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void test_index_ReturnsResponse() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk());
	}

	@Test
	void test_getTotal_ReturnsResponse() throws Exception {
		this.mockMvc
				.perform(post("/getTotal").contentType("application/json").param("veggieTacos", "1")
						.param("chickenTacos", "1").param("beefTacos", "1").param("chorizoTacos", "1"))
				.andDo(print()).andExpect(status().isOk());
	}

}
