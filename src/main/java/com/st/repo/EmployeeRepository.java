package com.st.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.st.beans.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
