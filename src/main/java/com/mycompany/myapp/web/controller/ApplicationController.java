package com.mycompany.myapp.web.controller;

import static net.logstash.logback.argument.StructuredArguments.kv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping("/api")
public class ApplicationController {
	
	 private static final Logger logger = LoggerFactory.getLogger(ApplicationController.class);
	
	
    @Value("${spring.application.version}")
    private String version;

    @Value("${spring.application.environment}")
    private String environment;

	@GetMapping(value = "/version")
	@ApiOperation(value = "Show API application", notes = "Notes on displaying application version")
	public String showVersion() {
		
        logger.info("Running version {} of Demo application", version, kv("type", "SAL"));
        
        logger.info("Running Demo application in environment {}", environment, kv("type", "SAL"));

		return version;
	}


}
