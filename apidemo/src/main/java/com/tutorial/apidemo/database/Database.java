package com.tutorial.apidemo.database;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorial.apidemo.repositories.ProductRepository;

@Configuration
public class Database {
    //logger
    private static final Logger logger = (Logger)LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args)throws Exception {
                // Product productA = new Product("MacBook", 2020,  2400.0f, "");
                // Product productB = new Product("MacBook Air", 2021, 3400.0f, "");
                // logger.info("Insert data: " + productRepository.save(productA));
                // logger.info("Insert data: " + productRepository.save(productB));
            }
        };
    }
}
