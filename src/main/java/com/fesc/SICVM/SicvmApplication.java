       package com.fesc.SICVM;

import org.modelMapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SicvmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SicvmApplication.class, args);

		System.out.println("SICVM corriendo...");
	}

	@Bean
	public ModelMapper modelmapper(){

		ModelMapper modelMapper=new ModelMapper();

		return modelMapper;
	}


	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder(){

		return new BCryptPasswordEncoder();
	}
}
