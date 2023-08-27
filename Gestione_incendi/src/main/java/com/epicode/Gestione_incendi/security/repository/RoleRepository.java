package com.epicode.Gestione_incendi.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epicode.Gestione_incendi.security.entity.ERole;
import com.epicode.Gestione_incendi.security.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
