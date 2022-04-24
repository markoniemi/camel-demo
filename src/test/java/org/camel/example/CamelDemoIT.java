package org.camel.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CamelDemoIT {
    private TestRestTemplate testRestTemplate = new TestRestTemplate();
    private String url="http://localhost:8080";
    @Test
    void test() {
        assertTrue(testRestTemplate.getForObject(url + "/api/bean", String.class).contains("Hello"));
    }
}
