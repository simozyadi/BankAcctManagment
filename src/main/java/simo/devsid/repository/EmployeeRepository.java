package simo.devsid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import simo.devsid.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
