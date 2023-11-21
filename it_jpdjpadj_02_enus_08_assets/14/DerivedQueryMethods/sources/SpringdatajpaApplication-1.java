package com.skillsoft.springdatajpa;

import com.skillsoft.springdatajpa.model.Employee;
import com.skillsoft.springdatajpa.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner EmployeeDemo(EmployeeRepository employeeRepository) {
		return (args) -> {

			employeeRepository.save(new Employee("Renee Bauer",
									"renee_bauer70@hotmail.com",2,
									new SimpleDateFormat("dd/MM/yyyy").parse("12/12/1994")));
			employeeRepository.save(new Employee("Raj Chawanda",
									"raj_chawanda@hotmail.com",3,
									new SimpleDateFormat("dd/MM/yyyy").parse("05/09/1988")));
			employeeRepository.save(new Employee("Neil Parks",
									"neil_parks82@hotmail.com",3,
									new SimpleDateFormat("dd/MM/yyyy").parse("13/04/1989")));
			employeeRepository.save(new Employee("Marcia Lin",
									"Marcia_Lin89@hotmail.com",4,
									new SimpleDateFormat("dd/MM/yyyy").parse("08/05/1994")));
			employeeRepository.save(new Employee("Ryan Sato",
									"ryan.sato@loonycorn.com",4,
									new SimpleDateFormat("dd/MM/yyyy").parse("02/12/1987")));
			employeeRepository.save(new Employee("Kyra Weiss",
									"kweiss.diallonics@gmail.com",3,
									new SimpleDateFormat("dd/MM/yyyy").parse("20/06/1986")));
			employeeRepository.save(new Employee("Marcia Lin",
									"marcia.lin@loonycorn",2,
									new SimpleDateFormat("dd/MM/yyyy").parse("12/12/1996")));

		};
	}
}
