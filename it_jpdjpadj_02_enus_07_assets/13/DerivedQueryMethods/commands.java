### Modify Employee.java to include new fields (refer Employee.java)

### Modify SpringdatajpaApplication.java to load new rows into the table (refer v1)

### Run the program - it goes through smoothly

### Confirm from the DB that the rows have been inserted
SELECT * FROM Employee;



Derived Queries with Multiple Parameters
-----------------------------------------

# combine multiple condition expressions by using And and Or keywords.

## Modify EmployeeRepository (refer v2)
## There is no Optional type used any more (just to keep things simple for the demos)
## We also include a method findByNameOrEmail

### Modify SpringdatajpaApplication (refer v2) to use the new method
### We call it multiple times with different combinations of name and email

### Run the program - the different types of output can be seen


### Add more methods to EmployeeRepository (refer v3)

    List<Employee> findByNameAndLevel(String name, int level);

    List<Employee> findByNameIs(String name);
    List<Employee> findByNameEquals(String name);

    List<Employee> findByNameIsNot(String name);


### Modify the EmployeeDemo method in SpringdatajpaApplication (refer v3) 
### to use the newly added methods and also findByName

### Run the program and view the output


### To EmployeeRepository, add more methods to search by name or email (refer v4)

    List<Employee> findByNameStartsWith(String prefix);

    List<Employee> findByNameEndingWith(String suffix);

    List<Employee> findByNameIgnoreCase(String name);

    List<Employee> findByNameLike(String pattern);

    Employee findFirstByName(String name);
    Employee findFirstByNameOrderByLevelAsc(String name);

    List<Employee> findByEmailContaining(String infix);

    Employee findFirstByOrderByEmail();

### Modify the EmployeeDemo method in SpringdatajpaApplication (refer v4) 
### to use the newly added methods

### Run the program and view the output


### Modify EmployeeRepository (refer v5) by first adding this import
import java.util.Date;

### Add the following methods

    List<Employee> findByLevelLessThan(int level);
    List<Employee> findByLevelLessThanEqual(int level);

    List<Employee> findByLevelGreaterThan(int level);
    List<Employee> findFirst2ByLevelOrderByBirthDateDesc (int level);

    List<Employee> findByBirthDateBefore(Date before);
    List<Employee> findByBirthDateAfter(Date after);
    List<Employee> findByBirthDateBetween(Date start, Date end);

    Employee findTopByOrderByBirthDateDesc();


### Modify the EmployeeDemo method in SpringdatajpaApplication (refer v5) 
### to use the newly added methods

### Run the program and view the output