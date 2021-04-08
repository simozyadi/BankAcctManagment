package simo.devsid.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import simo.devsid.Business.BusinessEmployee;
import simo.devsid.entities.Employee;

import java.util.List;

@RestController
public class EmployeeRestService {

    @Autowired
    private BusinessEmployee BusEmp;

    @RequestMapping(value = "/Employees",method = RequestMethod.POST)
    public Employee saveEmployee(@RequestBody Employee e) {
        return BusEmp.saveEmployee(e);
    }

    @RequestMapping(value = "/Employees",method = RequestMethod.GET)
    public List<Employee> getEmployee() {
        return BusEmp.getEmployee();
    }




}
