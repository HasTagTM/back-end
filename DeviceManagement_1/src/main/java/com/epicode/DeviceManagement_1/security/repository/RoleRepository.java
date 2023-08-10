package com.epicode.DeviceManagement_1.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epicode.DeviceManagement_1.security.entity.ERole;
import com.epicode.DeviceManagement_1.security.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
