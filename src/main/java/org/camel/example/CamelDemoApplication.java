package org.camel.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="org.camel.example")
public class CamelDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(CamelDemoApplication.class, args);
    }
}
