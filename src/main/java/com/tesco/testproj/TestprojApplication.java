package com.tesco.testproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan()
@EnableJpaRepositories("com.tesco.testproj.repository")
@EntityScan("com.tesco.testproj.models")
public class TestprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestprojApplication.class, args);
		System.out.println("hello1");
	}

}
