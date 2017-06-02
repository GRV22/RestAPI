package com.ganesh.demo.controllers;

import com.ganesh.demo.Services.DepartmentService;
import com.ganesh.demo.Services.EmployeeService;
import com.ganesh.demo.Services.OrganizationService;
import com.ganesh.demo.models.Department;
import com.ganesh.demo.models.Employee;
import com.ganesh.demo.models.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by ganesh.kumar on 5/24/17.
 */
@RestController
@RequestMapping("/v2")
public class GenericController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private OrganizationService organizationService;

    @RequestMapping( value = "/test" , method = RequestMethod.GET , headers = "application/json")
    public String retrieveTest(){
        return "{\"Status\":\"Working\"}";
    }

    @RequestMapping(value = "/employees" ,  method = RequestMethod.POST , headers = "application/json" )
    public Employee createEmployee(@RequestBody Employee employee , HttpServletRequest request){
        return this.employeeService.addEmployee(employee);
    }


    @RequestMapping(value = "/employees/{employeeId}" , method = RequestMethod.GET , headers = "application/json")
    public Employee retrieveEmployee(@PathVariable("employeeId") Long employeeId){
        return this.employeeService.getEmployeeById(employeeId);
    }

    @RequestMapping(value = "/employees" , method = RequestMethod.GET , headers = "application/json")
    public List<Employee> retrieveEmployees(@RequestParam("name") String name){
        return this.employeeService.getEmployeeByName(name);
    }

    @RequestMapping(value = "/employees/{employeeId}" , method = RequestMethod.POST , headers = "application/json")
    public Employee updateEmployeeDetails(@PathVariable("employeeId") Integer employeeId , @RequestBody Employee employee){
        return null;
    }

    @RequestMapping(value = "/employees/{employeeId}" , method = RequestMethod.DELETE , headers = "application/json")
    public String deleteEmployee(){
        return null;
    }

    @RequestMapping(value = "/employees" , method = RequestMethod.GET , headers = "application/json")
    public List<Employee> retrieveEmployeesById(@RequestParam(value = "employeeIds",required = true)List<Integer> employeeIds){
        System.out.println("Working");
        return null;
    }

    public List<Employee> retrieveEmployeesOfDepartment(){
        return null;
    }

    public Department createDepartment(){
        return null;
    }

    public Department retrieveDepartment(){
        return null;
    }

    public Organization createOrganization(){
        return null;
    }

    public Organization retrieveOrganization(){
        return null;
    }

    public List<Organization> retrieveOrganizations(){
        return null;
    }


    public String deleteOrganization(){
        return null;
    }


}
