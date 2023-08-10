package com.epicode.DeviceManagement_1.security.runner;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.epicode.DeviceManagement_1.security.service.DipendenteService;
import com.epicode.DeviceManagement_1.security.service.DispositivoService;
import com.epicode.DeviceManagement_1.enumerated.StatoDispositivo;
import com.epicode.DeviceManagement_1.security.entity.Dipendente;
import com.epicode.DeviceManagement_1.security.entity.ERole;
import com.epicode.DeviceManagement_1.security.entity.Role;
import com.epicode.DeviceManagement_1.security.payload.RegisterDto;
import com.epicode.DeviceManagement_1.security.repository.RoleRepository;
import com.epicode.DeviceManagement_1.security.repository.UserRepository;
import com.epicode.DeviceManagement_1.security.service.AuthService;


@Component
public class AuthRunner implements ApplicationRunner {
	
	@Autowired DispositivoService dispositivoSvc;
	@Autowired DipendenteService dipendenteSvc;
	@Autowired RoleRepository roleRepository;
	@Autowired UserRepository userRepository;
	@Autowired PasswordEncoder passwordEncoder;
	@Autowired AuthService authService;
	
	private Set<Role> adminRole;
	private Set<Role> moderatorRole;
	private Set<Role> userRole;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Run...");
		// Da lanciare solo la prima volta
		// setRoleDefault();
//		Dipendente d = dipendenteSvc.creaDipDefault("Hassan","programmazione", new Date(2023,07,06) , "responsabile");
//		Dipendente d1 = dipendenteSvc.creaDipDefault("Luca","programmazione", new Date(2023,05,06) , "programmatore");
//		Dipendente d2 = dipendenteSvc.creaDipDefault("Marco","cybersecurity", new Date(2022,05,06) , "security");
//		dispositivoSvc.creaTabletDefault(StatoDispositivo.DISPONIBILE, d, "tabletSamsung");
//		dispositivoSvc.creaPhoneDefault(StatoDispositivo.DISPONIBILE, d1, "phoneApple");
//		dispositivoSvc.creaComputerDefault(StatoDispositivo.DISPONIBILE, d2, "phoneApple");
//		dispositivoSvc.assegnaDispositivoADipendente(1l, 1l);
		
	}
	
	private void setRoleDefault() {
		Role admin = new Role();
		admin.setRoleName(ERole.ROLE_ADMIN);
		roleRepository.save(admin);
		
		Role user = new Role();
		user.setRoleName(ERole.ROLE_USER);
		roleRepository.save(user);
		
		Role moderator = new Role();
		moderator.setRoleName(ERole.ROLE_MODERATOR);
		roleRepository.save(moderator);
		
		adminRole = new HashSet<Role>();
		adminRole.add(admin);
		adminRole.add(moderator);
		adminRole.add(user);
		
		moderatorRole = new HashSet<Role>();
		moderatorRole.add(moderator);
		moderatorRole.add(user);
		
		userRole = new HashSet<Role>();
		userRole.add(user);
	}

}
