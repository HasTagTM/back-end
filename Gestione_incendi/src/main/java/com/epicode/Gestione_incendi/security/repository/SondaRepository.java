package com.epicode.Gestione_incendi.security.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.Gestione_incendi.security.entity.Sonda;

@Repository
public interface SondaRepository extends JpaRepository<Sonda, Long>{


}
