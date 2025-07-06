package com.example.jpacomparison.repository;

import com.example.jpacomparison.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // No need to write any methods – Spring Data JPA provides basic CRUD automatically
}
