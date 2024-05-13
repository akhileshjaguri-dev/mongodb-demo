package com.mongodb.mongodbexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.mongodb.repository")
@ComponentScan(basePackages = "com.mongodb")
public class MongodbExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbExampleApplication.class, args);
	}

}
