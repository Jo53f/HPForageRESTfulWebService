package org.example.hpforagerestfulwebservice;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {
    private static Employees employees = new Employees();

    static {
        employees.getEmployees().add(new Employee("1", "John", "Doe", "", "CEO"));
        employees.getEmployees().add(new Employee("2", "Jane", "Doe", "", "VP"));
        employees.getEmployees().add(new Employee("3", "John", "Smith", "", "Dev"));
        employees.getEmployees().add(new Employee("4", "Jane", "Smith", "", "QA"));
    }

    public Employees getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.getEmployees().add(employee);
    }
}
