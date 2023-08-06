package com.epicode.GestioneDispositivi.security.service;

import java.time.LocalDate;
import java.util.Set;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.GestioneDispositivi.enuerated.StatoDispositivo;
import com.epicode.GestioneDispositivi.security.entity.AssegnaDispositivi;
import com.epicode.GestioneDispositivi.security.entity.Computer;
import com.epicode.GestioneDispositivi.security.entity.Dipendente;
import com.epicode.GestioneDispositivi.security.entity.MobilePhone;
import com.epicode.GestioneDispositivi.security.entity.Role;
import com.epicode.GestioneDispositivi.security.entity.Tablet;
import com.epicode.GestioneDispositivi.security.entity.User;
import com.epicode.GestioneDispositivi.security.repository.IGestioneDispositiviPageable;
import com.epicode.GestioneDispositivi.security.repository.IGestioneRepoCrud;

@Service
public class GestioneDispositiviService {

	@Autowired @Qualifier("crea_user") private ObjectProvider<User> userProvider;
	@Autowired @Qualifier("crea_tablet") private ObjectProvider<Tablet> tabletProvider;
	@Autowired @Qualifier("crea_computer") private ObjectProvider<Computer> computerProvider;
	@Autowired @Qualifier("crea_phone") private ObjectProvider<MobilePhone> phoneProvider;
	@Autowired @Qualifier("crea_dipendente") private ObjectProvider<Dipendente> dipendenteProvider;
	@Autowired @Qualifier("crea_assegnazione_dispositivi") private ObjectProvider<AssegnaDispositivi> assDispProvider;
	
	@Autowired IGestioneDispositiviPageable pageableGestDispRepo;
	@Autowired IGestioneRepoCrud gestDispRepo;
	
//	public User creaUser() {
//		return userProvider.getObject();
//	}

//	public void creaUserDefault(String name, String username, String email, String password, Set<Role> roles) {
//		
//	}
//	
//	public void creaDipendente() {
//		Computer cpu = computerProvider.getObject();
//		gestDispRepo.save(cpu);
//	}
}
