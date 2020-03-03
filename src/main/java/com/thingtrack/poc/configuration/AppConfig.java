package com.thingtrack.poc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.thingtrack.poc.service.ProductService;
import com.thingtrack.poc.service.ProductServiceImpl;

@Configuration
@EnableMongoRepositories({"com.thingtrack.poc.repository"})
@ComponentScan(basePackages = "com.thingtrack.poc")
public class AppConfig {
    @Bean
    public ProductService getCountryService() { 
    	return new ProductServiceImpl(); 
    }
}
