package com.game.wordgames;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.game")
public class WordgamesApplication {

	public static void main(String[] args) {
		SpringApplication.run(WordgamesApplication.class, args);
		
		System.out.println("hello");
	}

}
