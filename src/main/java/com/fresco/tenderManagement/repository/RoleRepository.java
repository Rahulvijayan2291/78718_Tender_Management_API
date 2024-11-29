package com.fresco.tenderManagement.repository;

import com.fresco.tenderManagement.model.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleModel, Integer> {
    RoleModel findByRolename(String rolename);
}
