package com.marques.marcos.octoevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class OctoeventApplication extends SpringBootServletInitializer{

	/**
     * Used when run as JAR
     */
	public static void main(String[] args) {
		SpringApplication.run(OctoeventApplication.class, args);
	}
	
	/**
     * Used when run as WAR
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(OctoeventApplication.class);
    }

}
