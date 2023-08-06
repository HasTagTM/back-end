package com.epicode.DeviceManagement.security.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.epicode.DeviceManagement.security.entity.Dispositivo;

public interface DispositivoRepoPageable extends PagingAndSortingRepository<Dispositivo, Long>{

}
