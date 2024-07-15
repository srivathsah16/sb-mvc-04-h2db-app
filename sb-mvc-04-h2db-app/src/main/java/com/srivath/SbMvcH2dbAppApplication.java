package com.srivath;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SbMvcH2dbAppApplication {

	public static void main(String[] args) { 
		SpringApplication.run(SbMvcH2dbAppApplication.class, args);
	}
	
	@Bean
	public ModelMapper getMapper() {
		return new ModelMapper();
	}

}
