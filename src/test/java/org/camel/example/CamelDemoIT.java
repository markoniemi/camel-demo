package org.camel.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CamelDemoIT {
    private TestRestTemplate testRestTemplate = new TestRestTemplate();
    private String url = "http://localhost:8080";

    @Test
    void test() {
        ResponseEntity<String> response = testRestTemplate.exchange(url + "/api/bean", HttpMethod.GET, null,
                String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        response.getBody();
        assertTrue(response.getBody().contains("Hello"));
    }
}
