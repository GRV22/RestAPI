package com.ganesh.demo.repository;

import com.ganesh.demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ganesh.kumar on 5/24/17.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee , Long>{

    Employee findById(Long id);

    List<Employee> findByName(String name);

    @Modifying
    @Query("update Employee e set e.name = ?1 where e.id = ?2")
    Employee updateEmployeeNameById(String name , Long id);

}
