package org.example.hpforagerestfulwebservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @PostMapping(value = "/add", consumes = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
        employeesM.addEmployee(employee);

        URI employeeLocation = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employee.employee_id())
                .toUri();

        return ResponseEntity.created(employeeLocation).build();
    }

}
