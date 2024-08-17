package com.relin.beanny;


import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class BeannyApplication {
	public static void main(String[] args) {
		SpringApplication.run(BeannyApplication.class, args);
	}
}
