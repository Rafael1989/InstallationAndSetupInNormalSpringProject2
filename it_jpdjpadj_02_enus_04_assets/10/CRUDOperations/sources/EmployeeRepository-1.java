package com.skillsoft.springDataJPA.repository;

import com.skillsoft.springDataJPA.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
