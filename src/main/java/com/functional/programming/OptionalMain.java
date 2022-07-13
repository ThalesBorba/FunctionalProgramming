package com.functional.programming;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class OptionalMain {

	public static void main(String[] args) {

		Optional.ofNullable(null)
				.ifPresentOrElse(pessoa -> System.out.println("Olá, " + pessoa),
						() -> System.out.println("Cadê você?"));


	}
}
