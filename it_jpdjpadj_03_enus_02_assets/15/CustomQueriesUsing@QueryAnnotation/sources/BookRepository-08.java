package com.skillsoft.springdatajpa.repository;

import com.skillsoft.springdatajpa.model.Book;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    @Query(value = "SELECT * FROM Book b WHERE b.available = 1", nativeQuery = true)
    List<Book> findAvailableBooks();

    @Query("SELECT b FROM Book b WHERE b.author = :author")
    List<Book> findByAuthor(@Param("author")String author);

    @Query("SELECT b FROM Book b WHERE b.author = :author AND b.available = :avail ORDER BY title")
    List<Book> findByAuthorAndAvailability(@Param("author")String author,
                                           @Param("avail")boolean availability);

    @Modifying
    @Query("UPDATE Book b SET b.title = ?1 WHERE b.bookId = ?2")
    int updateTitleById(String title, Long bookId);
}
