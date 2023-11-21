// Go over to JpaAppConfiguration.java - change the database name

dataSource.setUrl("jdbc:mysql://localhost:3306/BookStore?createDatabaseIfNotExist=true&useSSL=false");

// Create an entity class Book - refer Book.java
// Create repository Book - ref er BookRepository-01.java
// define a custom query using JPQL to retrieve all available Book Details

    @Query("SELECT b FROM Book b WHERE b.available = true")
    List<Book> findByAvailableBook();

// Go to SpringDataJpaApplication-01.java

// create Book Data

      bookRepository.save(new Book("Anna Karenina", "Leo Tolstoy",9,true));
      bookRepository.save(new Book("Pride and Prejudice", "Jane Austen",8,false));
      bookRepository.save(new Book("The Merchant of Venice", "Shakespeare",8,true));
      bookRepository.save(new Book("A Tale of Two Cities", "Charles Dickens",5,true));
      bookRepository.save(new Book("The Tunnel", "William H. Gass",4,false));


////// Run the program - it goes through smoothly

////// Head to the SQL Client and confirm the contents of the table
USE BookStore ;

SELECT * FROM Book;


////// Modify the BookDemo method in SpringdatajpaApplication (refer v-02)

  @Bean
  public CommandLineRunner BookDemo(BookRepository bookRepository) {
    return (args) -> {

      System.out.println("\n**************************");
      System.out.println("\nQuerying for available books...");

      List<Book> availableBooks = bookRepository.findAvailableBooks();
      System.out.println("\nOUTPUT:\n" + availableBooks.toString());

      System.out.println("\n**************************");

    };

  }

// Run the program and view the results.

// SELECT clause is optional - it can be omitted
//////  We can change the Query in the interface - refer BookRepository-03.java

    @Query("FROM Book b WHERE b.available = true")
    List<Book> findAvailableBooks();


// No changes to SpringdatajpaApplication - Run the program
// The output is the same


// The same query can be written in native SQL format. 
// All you need to do is just set the nativeQuery attribute value to true and 
// define the native SQL query in the value attribute of the @Query annotation:
////// Refer to v-04


    @Query(value = "SELECT * FROM Book b WHERE b.available = 1", nativeQuery = true)
    List<Book> findAvailableBooks();

// No changes to SpringdatajpaApplication - Run the program
// The output is the same




Positional Bind Parameters
------------------------------------
// A positional bind parameter is referenced by its position in the query. 
// They are defined with ? followed by a number that specifies the position
// - refer to BookRepository-05.java

// single bind parameter

    @Query("SELECT b FROM Book b WHERE b.author = ?1")
    List<Book> findByAuthor(String author);

// Go to SpringDataJpaApplication-05.java 
// Add 2 more book details call the interface

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


// Run and view the output

// multiple bind parameters -refer BookRepository-06.java 

    @Query("SELECT b FROM Book b WHERE b.author = ?1 AND b.available = ?2")
    List<Book> findByAuthorAndAvailability(String author, boolean available);

// Go to SpringDataJpaApplication-06.java 

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

// Run and view the output



 Named Bind Parameters
 ----------------------
// Named bind parameters are another way of passing method parameter values to 
// the query bind parameters. A named bind parameter starts with : followed by 
// the name of the parameter. 

// -reffer BookRepository-07.java

// single and multiple named parameters

    @Query("SELECT b FROM Book b WHERE b.author = :author")
    List<Book> findByAuthor(@Param("author")String author);

    @Query("SELECT b FROM Book b WHERE b.author = :author AND b.available = :avail ORDER BY title" )
    List<Book> findByAuthorAndAvailability(@Param("author")String author,
                                           @Param("avail")boolean availability); boolean available);



// Refer to SpringdatajpaApplication-07.java 
//// Make these changes to the BookDemo method

  @Bean
  public CommandLineRunner BookDemo(BookRepository bookRepository) {
    return (args) -> {

      System.out.println("\n**************************");

      System.out.println("\nBooks authored by Shakespeare...");
      List<Book> books = bookRepository.findByAuthor("Shakespeare");
      System.out.println("\nOUTPUT:\n" + books.toString());

      System.out.println("\nAvailable books authored by Shakespeare...");
      books = bookRepository.findByAuthorAndAvailability("Shakespeare", true);
      System.out.println("\nOUTPUT:\n" + books.toString());

      System.out.println("\n**************************");

    };

  }





Update Queries with @Modifying Annotation
------------------------------------------
// Go to mysqlworkbench and show the table

SELECT * FROM Book;



// -Refer to BookRepository-08.java
////// Add this import
import org.springframework.data.jpa.repository.Modifying;

////// Add this method 

    @Modifying
    @Query("UPDATE Book b SET b.title = ?1 WHERE b.bookId = ?2")
    int updateTitleById(String title, Long bookId);

 // Go to SpringDataJpaApplication-08.java 
 ////// Update the book with the title "Merchant of Venice"
 ////// Use the appropriate ID - I have used 3l here

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

// Run the programme and show the error - a transaction needs to be set

// Go to the  BookRepository and add the @Transactional annotation to the interface
////// Refer to BookRepository-09

@Transactional
public interface BookRepository extends CrudRepository<Book, Long> {

//// Run the program again - the output confirms the output

// Go to mysqlworkbench and view the table and confirm again

SELECT * FROM Book;

// The row has been updated

// -Refer to BookRepository-10.java
////// Add this new delete method
    @Modifying
    @Query("DELETE FROM Book b WHERE b.title = ?1")
    void deleteByTitle(String title);

  // Go to SpringDataJpaApplication-10.java 
  
  @Bean
  public CommandLineRunner BookDemo(BookRepository bookRepository) {
    return (args) -> {

      System.out.println("\n**************************");
      System.out.println("Deleting one of the books...");

      bookRepository.deleteByTitle("The Tunnel");

      System.out.println("\nAll the books in the store...");
      for (Book book : bookRepository.findAll()) {
        System.out.print(book.toString());
      }

      System.out.println("\n**************************");
    };
  }

////// Run the program - it should go through and the book is no longer listed

// Go to mysqlworkbench and confirm

SELECT * FROM Book;

// The row has been Deleted