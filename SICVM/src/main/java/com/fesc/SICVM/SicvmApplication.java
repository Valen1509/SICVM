package com.fesc.SICVM;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SicvmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SicvmApplication.class, args);

		System.out.println("Api corriendo...");
	}

	@Bean
	public ModelMapper modelMapper(){

		ModelMapper modelMapper= new ModelMapper();

		return modelMapper;
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}

}
