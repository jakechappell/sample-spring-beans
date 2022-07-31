package com.example.samplebeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SampleBeansApplication {

	public static void main(String[] args) {
		ApplicationContext apc = SpringApplication.run(SampleBeansApplication.class, args);
		for(String s : apc.getBeanDefinitionNames()){
			System.out.println(s);
		}
		// Print out beans used in the application
	}

	@Bean
	public String getRandomBean(){
		return "Random Bean";
	}
}
