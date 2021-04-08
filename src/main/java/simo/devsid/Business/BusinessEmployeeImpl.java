package simo.devsid.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simo.devsid.entities.Employee;
import simo.devsid.repository.EmployeeRepository;

import java.util.List;

@Service
public class BusinessEmployeeImpl implements BusinessEmployee{

    @Autowired
    private EmployeeRepository empRepo;
    @Override
    public Employee saveEmployee(Employee e) {
        return empRepo.save(e);

    }

    @Override
    public List<Employee> getEmployee() {
        return empRepo.findAll();
    }
}
