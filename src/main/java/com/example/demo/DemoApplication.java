package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext cxt) {
		return args -> {
			System.out.println("Printing all beans provided by SpringBoot: ");
			String[] beanDefinitionNames = cxt.getBeanDefinitionNames();
			Arrays.sort(beanDefinitionNames);
			for(String beanName : beanDefinitionNames) {
				System.out.println("beanName = " + beanName);
			}
		};
	}


}
