package com.epicode.DeviceManagement_1.security.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.epicode.DeviceManagement_1.security.entity.Dipendente;

public interface DipendenteRepoPageable extends PagingAndSortingRepository<Dipendente, Long>{

}
