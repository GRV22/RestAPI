package com.ganesh.demo.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ganesh.kumar on 5/24/17.
 */
@Entity(name = "organization")
public class Organization {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column(columnDefinition = "varchar(100) not null",unique = true)
    private String name;

    @OneToMany
    @JoinTable( name = "org_dept_map",
            joinColumns = {@JoinColumn(referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(referencedColumnName = "id")})
    private Set<Department> departments = new HashSet<Department>();

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

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }
}
