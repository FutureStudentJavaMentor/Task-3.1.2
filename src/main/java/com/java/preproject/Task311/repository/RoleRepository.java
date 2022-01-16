package com.java.preproject.Task311.repository;

import com.java.preproject.Task311.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
     Role findByName(String name);

}
