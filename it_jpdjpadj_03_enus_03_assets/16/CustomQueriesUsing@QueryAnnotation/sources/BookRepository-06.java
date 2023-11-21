package com.skillsoft.springdatajpa.repository;

import com.skillsoft.springdatajpa.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    @Query(value = "SELECT * FROM Book b WHERE b.available = 1", nativeQuery = true)
    List<Book> findAvailableBooks();

    @Query("SELECT b FROM Book b WHERE b.author = ?1")
    List<Book> findByAuthor(String author);

    @Query("SELECT b FROM Book b WHERE b.author = ?1 AND b.available = ?2")
    List<Book> findByAuthorAndAvailability(String author, boolean available);
}
