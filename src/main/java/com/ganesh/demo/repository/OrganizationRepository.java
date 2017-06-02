package com.ganesh.demo.repository;

import com.ganesh.demo.models.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by ganesh.kumar on 5/24/17.
 */
public interface OrganizationRepository extends JpaRepository<Organization , Long>{

    Organization findByName(String name);

}
