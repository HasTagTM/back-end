package com.epicode.DeviceManagement_1.security.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.epicode.DeviceManagement_1.security.entity.Dispositivo;

public interface DispositivoRepoPageable extends PagingAndSortingRepository<Dispositivo, Long>{

}
