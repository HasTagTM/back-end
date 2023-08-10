package com.epicode.DeviceManagement_1.security.entity;

import java.util.Date;

import org.springframework.security.access.prepost.PreAuthorize;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "dipendenti")
public class Dipendente{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false)
    private String nome;
	
	@Column(nullable = false)
    private String reparto;

    private Date dataAssunzione;
	@Column(nullable = false)
    private String ruoloAziendale;


}
