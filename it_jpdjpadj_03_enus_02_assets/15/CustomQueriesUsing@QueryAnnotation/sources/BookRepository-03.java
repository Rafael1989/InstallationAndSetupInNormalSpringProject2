package com.skillsoft.springdatajpa.repository;

import com.skillsoft.springdatajpa.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    @Query("FROM Book b WHERE b.available = true")
    List<Book> findAvailableBooks();
}
