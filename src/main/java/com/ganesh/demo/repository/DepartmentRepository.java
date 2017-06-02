package com.ganesh.demo.repository;


import com.ganesh.demo.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ganesh.kumar on 5/24/17.
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {



}
