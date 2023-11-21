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
			System.out.println("Updating one of the books...");

			bookRepository.updateTitleById("The Tempest",3L);

			System.out.println("\nBooks authored by Shakespeare...");
			List<Book> books = bookRepository.findByAuthor("Shakespeare");
			System.out.println("\nOUTPUT:\n" + books.toString());

			System.out.println("\n**************************");

		};
	}
}
