package org.example.hpforagerestfulwebservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
class EmployeeController {
    @Autowired
    private EmployeeManager employeesM;

    @GetMapping("/")
    public Employees getEmployees() {
        return employeesM.getEmployees();
    }

    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee employee) {
        employeesM.addEmployee(employee);
    }

}
