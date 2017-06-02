package com.ganesh.demo.Services;

import com.ganesh.demo.models.Employee;
import com.ganesh.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ganesh.kumar on 5/24/17.
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
        return this.employeeRepository.save(employee);
    }

    public Employee getEmployeeById(Long id){
        return this.employeeRepository.findById(id);
    }

    public List<Employee> getEmployeeByName(String name){
        return this.employeeRepository.findByName(name);
    }

    public Employee updateEmployeeName(Employee employee){
        Employee employee1= this.employeeRepository.findById(employee.getId());
        employee1.setName(employee.getName());
        return this.employeeRepository.save(employee1);
    }

    public Employee updateEmployeeNameViaQuery(Employee employee){
        return this.employeeRepository.updateEmployeeNameById(employee.getName(),employee.getId());
    }

}
