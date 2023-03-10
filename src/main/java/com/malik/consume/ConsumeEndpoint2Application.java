package com.malik.consume;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.malik.controller"})
//@SpringBootApplication
public class ConsumeEndpoint2Application {
	private static final Logger log = LoggerFactory.getLogger(ConsumeEndpoint2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumeEndpoint2Application.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			log.info("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				log.info("beanName: " + beanName);
			}

		};
	}

}
