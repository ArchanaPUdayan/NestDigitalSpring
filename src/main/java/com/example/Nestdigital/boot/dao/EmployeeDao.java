package com.example.Nestdigital.boot.dao;

import com.example.Nestdigital.boot.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
