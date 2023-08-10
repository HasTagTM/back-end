package com.epicode.DeviceManagement_1.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.epicode.DeviceManagement_1.security.entity.Dipendente;
import com.epicode.DeviceManagement_1.security.entity.Dispositivo;

@Repository
public interface IDispositivoRepository extends JpaRepository<Dispositivo, Long>{

}
