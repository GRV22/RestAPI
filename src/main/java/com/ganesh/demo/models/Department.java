package com.ganesh.demo.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ganesh.kumar on 5/24/17.
 */
@Entity(name = "department")
public class Department {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column(columnDefinition = "varchar(100) not null")
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "dept_emp_map",
                joinColumns = {@JoinColumn(referencedColumnName = "id")},
                inverseJoinColumns = { @JoinColumn(referencedColumnName = "id")} )
    private Set<Employee> employees =  new HashSet<Employee>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
