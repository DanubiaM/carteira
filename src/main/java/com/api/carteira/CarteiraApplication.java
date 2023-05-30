package com.api.carteira;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class CarteiraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarteiraApplication.class, args);
	}

}
