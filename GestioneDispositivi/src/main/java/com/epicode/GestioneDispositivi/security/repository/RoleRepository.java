package com.epicode.GestioneDispositivi.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epicode.GestioneDispositivi.security.entity.ERole;
import com.epicode.GestioneDispositivi.security.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
