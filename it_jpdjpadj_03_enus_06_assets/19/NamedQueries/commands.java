
### Confirm the contents of the Book table from the DB client (e.g. MySQLWorkbench)
SELECT * FROM Book;


# We can create named queries by using an 
# external properties file, Java annotations, or an XML file. 
# Spring Data JPA supports both JPQL and native SQL named queries.

1. Using a Properties File
---------------------------

# first create META-INF folder inside /src/main/resources/
# create a file jpa-named-queries.properties
# add the Queries

# find all books order by descending order of rating
Book.findAllNamedQuery=SELECT b FROM Book b ORDER BY b.rating DESC

# find books by title
Book.findByTitleNamedQuery=SELECT b FROM Book b WHERE b.title = ?1

# find a book by author
Book.findByAuthorNativeNamedQuery=SELECT * FROM book b WHERE b.author = :author


# Go to repository create the query interface - refer BookRepository-1.java

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findAllNamedQuery();

    List<Book> findByTitleNamedQuery(String title);

    @Query(nativeQuery = true)
    List<Book> findByAuthorNativeNamedQuery(@Param("author")String author);
}


### Modify the main class - refer to SpringdatajpaApplication-1.java

#  Run the program and confirm the output


2. Using the orm.xml File
--------------------------

# create an orm.xml file inside the same META-INF folder for declaring named queries.

<?xml version="1.0" encoding="UTF-8"?>
<entity-mappings version="2.0" xmlns="http://java.sun.com/xml/ns/persistence/orm"
                 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                 xsi:schemaLocation="http://java.sun.com/xml/ns/persistence/orm
        http://java.sun.com/xml/ns/persistence/orm_2_0.xsd ">

    <!--find all books order by price descending-->
    <named-query name="Book.findAllXML">
        <query>SELECT b FROM Book b ORDER BY b.rating DESC</query>
    </named-query>

    <!--find books by minimum rating-->
    <named-query name="Book.findByMinRatingXML">
        <query>SELECT b FROM Book b WHERE b.rating >= ?1 ORDER BY b.rating</query>
    </named-query>

    <!--native SQL query to find a book by author-->
    <named-native-query name="Book.findByAuthorNativeXML"
                        result-class="com.skillsoft.springdatajpa.model.Book">
        <query>SELECT * FROM book b WHERE b.author = :author</query>
    </named-native-query>

</entity-mappings>

# Add 3 new methods to BookRepository - refer to BookRepository-2.java

    List<Book> findAllXML();

    List<Book> findByMinRatingXML(int minRating);

    @Query(nativeQuery = true)
    List<Book> findByAuthorNativeXML(@Param("author")String author);


# Modify the BookDemo function -refer SpringdatajpaApplication-2.java

  @Bean
  public CommandLineRunner BookDemo(BookRepository bookRepository) {
    return (args) -> {

      System.out.println("\n**************************");

      System.out.println("Retrieving all books...");
      List<Book> books = bookRepository.findAllXML();

      System.out.println("\nOUTPUT:\n" + books.toString());
      System.out.println("\n**************************");

      System.out.println("\nRetrieving books based on rating...");
      books = bookRepository.findByMinRatingXML(8);

      System.out.println("\nOUTPUT:\n" + books.toString());
      System.out.println("\n**************************");

      System.out.println("\nRetrieving books based on author...");
      books = bookRepository.findByAuthorNativeXML("Shakespeare");

      System.out.println("\nOUTPUT:\n" + books.toString());
      System.out.println("\n**************************");

    };
  }

#  Run this programme and show the output

3. Using Annotations
---------------------

# Add the Query in entity class - refer Book-3.java

@NamedQuery(name = "Book.findAvailableBooksJPQL",
        query = "SELECT b FROM Book b WHERE b.available = 1")

@NamedQuery(name = "Book.findByRatingJPQL",
        query = "SELECT b FROM Book b WHERE b.rating >= ?1")

@NamedNativeQuery(name = "Book.findByTitleNative",
        query = "SELECT * FROM book b WHERE b.title = :title",
        resultClass = Book.class)


# Add the new named query references to BookRepository.java (refer v3)

    List<Book> findAvailableBooksJPQL();

    List<Book> findByRatingJPQL(int minRating);

    @Query(nativeQuery = true)
    List<Book> findByTitleNative(@Param("title")String title);



# Modify the BookDemo method - refer to SpringdatajpaApplication-3.java

  @Bean
  public CommandLineRunner BookDemo(BookRepository bookRepository) {
    return (args) -> {

      System.out.println("\n**************************");

      System.out.println("Retrieving available books...");
      List<Book> books = bookRepository.findAvailableBooksJPQL();

      System.out.println("\nOUTPUT:\n" + books.toString());
      System.out.println("\n**************************");

      System.out.println("\nRetrieving books based on rating...");
      books = bookRepository.findByRatingJPQL(8);

      System.out.println("\nOUTPUT:\n" + books.toString());
      System.out.println("\n**************************");

      System.out.println("\nRetrieving books based on title...");
      books = bookRepository.findByTitleNative("Anna Karenina");

      System.out.println("\nOUTPUT:\n" + books.toString());
      System.out.println("\n**************************");

    };
  }

# Run the programme and view the result