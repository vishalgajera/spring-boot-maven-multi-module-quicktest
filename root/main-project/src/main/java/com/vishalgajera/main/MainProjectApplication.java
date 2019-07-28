package com.vishalgajera.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * The Class MainProjectApplication.
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.vishalgajera" })
public class MainProjectApplication {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(MainProjectApplication.class, args);
	}

}
