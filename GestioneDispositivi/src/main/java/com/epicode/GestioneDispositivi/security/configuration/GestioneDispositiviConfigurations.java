package com.epicode.GestioneDispositivi.security.configuration;

import java.time.LocalDate;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.GestioneDispositivi.enuerated.StatoDispositivo;
import com.epicode.GestioneDispositivi.security.entity.AssegnaDispositivi;
import com.epicode.GestioneDispositivi.security.entity.Computer;
import com.epicode.GestioneDispositivi.security.entity.Dipendente;
import com.epicode.GestioneDispositivi.security.entity.Dispositivo;
import com.epicode.GestioneDispositivi.security.entity.MobilePhone;
import com.epicode.GestioneDispositivi.security.entity.Role;
import com.epicode.GestioneDispositivi.security.entity.Tablet;
import com.epicode.GestioneDispositivi.security.entity.User;

@Configuration
public class GestioneDispositiviConfigurations {

//	@Bean("crea_user")
//	@Scope("prototype")
//	public User creaUser() {
//		return new User();
//	}
//	
//	@Bean
//	@Scope("prototype")
//	public User createUserDefault(String name, String username, String email, String password, Set<Role> roles) {
//		User u = new User();
//		return u.builder().name(name).username(username).email(email).password(password).roles(roles).build();
//		
//	}
	
	@Bean("crea_tablet")
	@Scope("prototype")
	public Tablet creaDispTablet() {
		return new Tablet();
	}
	
	@Bean
	@Scope("prototype")
	public Tablet creaTabletDefault(StatoDispositivo stato, Dipendente dipendente, String name) {
		Tablet t = new Tablet();
		t.setStato(stato);
		t.setDipendente(dipendente);
		t.setName(name);
		return t;
	}
	
	@Bean("crea_computer")
	@Scope("prototype")
	public Computer creaDispComputer() {
		return new Computer();
	}
	
	@Bean
	@Scope("prototype")
	public Computer creaComputerDefault(StatoDispositivo stato, Dipendente dipendente, String name) {
		Computer cpu = new Computer();
		cpu.setStato(stato);
		cpu.setDipendente(dipendente);
		cpu.setName(name);
		return cpu;
	}
	
	@Bean("crea_phone")
	@Scope("prototype")
	public MobilePhone creaDispPhone() {
		return new MobilePhone();
	}
	
	@Bean
	@Scope("prototype")
	public MobilePhone creaPhoneDefault(StatoDispositivo stato, Dipendente dipendente, String name) {
		MobilePhone p = new MobilePhone();
		p.setStato(stato);
		p.setDipendente(dipendente);
		p.setName(name);
		return p;
	}
	
	@Bean("crea_assegnazione_dispositivi")
	@Scope("prototype")
	public AssegnaDispositivi creaAssegnaDispositivo() {
		return new AssegnaDispositivi();
	}
	
	@Bean
	@Scope("prototype")
	public AssegnaDispositivi creaAssegnaDispDefault(Dipendente dipendente, Dispositivo dispositivo, LocalDate dataAssegnazione,
			LocalDate dataScadenzaAssegnazione) {
		AssegnaDispositivi assDisp = new AssegnaDispositivi();
		assDisp.setDipendente(dipendente);
		assDisp.setDispositivo(dispositivo);
		assDisp.setDataAssegnazione(dataAssegnazione);
		assDisp.getDataScadenzaAssegnazione();
		return assDisp;
	}
	
	@Bean("crea_dipendente")
	@Scope("prototype")
	public Dipendente creaDipendente() {
		return new Dipendente();
	}
	
	@Bean
	@Scope("prototype")
	public Dipendente creaDipDefault(Dispositivo dispositivo) {
		Dipendente d = new Dipendente();
		d.setDispositivo(dispositivo);
		return d;
	}
	
}
