package com.example.cdr.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CdrQueryControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testQueryCdrsEndpoint() throws Exception {
        String requestJson = """
        {
            "record_date_start": "2023-08-18 10:30:00",
            "record_date_end": "2023-08-18 10:31:00",
            "msisdn": "9900112233"
        }
        """;

        mockMvc.perform(post("/api/v1/cdr/query")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestJson))
                .andExpect(status().isOk());
    }
}
