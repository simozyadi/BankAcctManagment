package simo.devsid.Business;

import simo.devsid.entities.Employee;

import java.util.List;

public interface BusinessEmployee {
   Employee saveEmployee(Employee e);
   List<Employee> getEmployee();
}
