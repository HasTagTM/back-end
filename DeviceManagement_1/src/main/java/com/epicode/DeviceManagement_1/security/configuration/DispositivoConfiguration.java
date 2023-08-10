package com.epicode.DeviceManagement_1.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.DeviceManagement_1.enumerated.StatoDispositivo;
import com.epicode.DeviceManagement_1.security.entity.Computer;
import com.epicode.DeviceManagement_1.security.entity.Dipendente;
import com.epicode.DeviceManagement_1.security.entity.Dispositivo;
import com.epicode.DeviceManagement_1.security.entity.Phone;
import com.epicode.DeviceManagement_1.security.entity.Tablet;


@Configuration
public class DispositivoConfiguration {
	
	@Bean("crea_tablet")
	@Scope("prototype")
	public Dispositivo creaTablet() {
		return new Tablet();
	}
	
	@Bean("crea_tablet_default")
	@Scope("prototype")
	public Dispositivo creaTabletDefault(StatoDispositivo stato, Dipendente dipendente, String name) {
		Tablet t = new Tablet();
		t.setStato(stato);
		t.setDipendente(dipendente);
		t.setName(name);
		return t;
	}
	
	@Bean("crea_phone")
	@Scope("prototype")
	public Dispositivo creaPhone() {
		return new Phone();
	}
	
	@Bean("crea_phone_default")
	@Scope("prototype")
	public Dispositivo creaPhoneDefault(StatoDispositivo stato, Dipendente dipendente, String name) {
		Phone p = new Phone();
		p.setStato(stato);
		p.setDipendente(dipendente);
		p.setName(name);
		return p;
	}
	
	@Bean("crea_computer")
	@Scope("prototype")
	public Dispositivo creaComputer() {
		return new Computer();
	}
	
	@Bean("crea_computer_default")
	@Scope("prototype")
	public Dispositivo creaComputerDefault(StatoDispositivo stato, Dipendente dipendente, String name) {
		Computer c = new Computer();
		c.setStato(stato);
		c.setDipendente(dipendente);
		c.setName(name);
		return c;
	}
	
}
