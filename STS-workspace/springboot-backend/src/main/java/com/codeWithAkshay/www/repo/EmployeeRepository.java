package com.codeWithAkshay.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeWithAkshay.www.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>
{

}
