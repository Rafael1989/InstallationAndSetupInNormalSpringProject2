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

			bookRepository.save(new Book("Anna Karenina", "Leo Tolstoy",9,true));
			bookRepository.save(new Book("Pride and Prejudice", "Jane Austen",8,false));
			bookRepository.save(new Book("The Merchant of Venice", "Shakespeare",8,true));
			bookRepository.save(new Book("A Tale of Two Cities", "Charles Dickens",5,true));
			bookRepository.save(new Book("The Tunnel", "William H. Gass",4,false));

			//List<Book> availableBook= bookRepository.findAvailableBooks();
			//System.out.println("\nOUTPUT: "+availableBook.toString()+"\n");

		};

	}
}
