package org.springsecurity.securityapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springsecurity.securityapp.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {
    public Employee findByEmail(String email);
}
