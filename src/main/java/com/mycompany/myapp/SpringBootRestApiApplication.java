package com.mycompany.myapp;

import static net.logstash.logback.argument.StructuredArguments.kv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringBootRestApiApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootRestApiApplication.class);
	
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApiApplication.class, args);
        
        logger.info("Logging from demo app", kv("type", "SAL"));
    }
}
