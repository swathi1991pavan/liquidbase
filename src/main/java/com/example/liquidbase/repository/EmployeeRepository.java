package com.example.liquidbase.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.liquidbase.model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
