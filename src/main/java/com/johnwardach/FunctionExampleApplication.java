package com.johnwardach;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class FunctionExampleApplication {

	@Bean
	public Function<Integer, Boolean> isEven() {
		return (input) -> input % 2 == 0;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(FunctionExampleApplication.class, args);
	}

}