package com.epicode.DeviceManagement.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.epicode.DeviceManagement.security.entity.Dipendente;
import com.epicode.DeviceManagement.security.entity.Dispositivo;
import com.epicode.GestioneDispositivi.enuerated.StatoDispositivo;

@Repository
public interface IDispositivoRepository extends JpaRepository<Dispositivo, Long>{

}
