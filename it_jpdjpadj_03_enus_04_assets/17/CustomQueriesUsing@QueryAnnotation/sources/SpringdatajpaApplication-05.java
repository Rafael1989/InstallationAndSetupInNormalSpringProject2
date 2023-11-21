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

			bookRepository.save(new Book("King Lear", "Shakespeare",6,true));
			bookRepository.save(new Book("Macbeth", "Shakespeare",7,false));
			
			System.out.println("\n**************************");
			System.out.println("\nQuerying for books authored by Shakespeare...");

			List<Book> books = bookRepository.findByAuthor("Shakespeare");
			System.out.println("\nOUTPUT:\n" + books.toString());

			System.out.println("\n**************************");

		};

	}
}
