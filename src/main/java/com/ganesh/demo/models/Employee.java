package com.ganesh.demo.models;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by ganesh.kumar on 5/24/17.
 */
@Entity(name = "employee")
public class Employee {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column(columnDefinition = "varchar(100) not null")
    private String name;

    @Column(columnDefinition = "bigint(20) unsigned not null")
    private Long age;

    @ManyToMany(mappedBy = "employees")
    private Set<Department> departments;

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

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }
}
