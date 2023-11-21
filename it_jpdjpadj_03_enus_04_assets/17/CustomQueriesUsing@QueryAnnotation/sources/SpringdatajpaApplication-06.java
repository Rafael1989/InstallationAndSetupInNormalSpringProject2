package com.skillsoft.springdatajpa;

import com.skillsoft.springdatajpa.model.Book;
import com.skillsoft.springdatajpa.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner BookDemo(BookRepository bookRepository) {
		return (args) -> {

			System.out.println("\n**************************");
			System.out.println("\nQuerying for books authored by Shakespeare...");

			List<Book> books = bookRepository.findByAuthorAndAvailability("Shakespeare", true);
			System.out.println("\nOUTPUT:\n" + books.toString());

			System.out.println("\n**************************");

		};

	}
}
