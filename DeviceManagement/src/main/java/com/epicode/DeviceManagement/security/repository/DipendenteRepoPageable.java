package com.epicode.DeviceManagement.security.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.epicode.DeviceManagement.security.entity.Dipendente;

public interface DipendenteRepoPageable extends PagingAndSortingRepository<Dipendente, Long>{

}
