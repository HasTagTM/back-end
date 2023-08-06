package com.epicode.DeviceManagement.security.service;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.epicode.DeviceManagement.security.configuration.DipendenteConfiguration;
import com.epicode.DeviceManagement.security.entity.Dipendente;
import com.epicode.DeviceManagement.security.entity.Dispositivo;
import com.epicode.DeviceManagement.security.entity.User;
import com.epicode.DeviceManagement.security.repository.DipendenteRepoPageable;
import com.epicode.DeviceManagement.security.repository.IDipendenteRepository;
import com.epicode.DeviceManagement.security.repository.UserRepository;

@Service
public class DipendenteService {

    @Autowired IDipendenteRepository dipendenteRepository;
    @Autowired @Qualifier("crea_dipendente") ObjectProvider<Dipendente> dipendenteProvider;
    @Autowired UserRepository userRepo;
    @Autowired DipendenteRepoPageable dipendentePageRepo;
    
    public Dipendente creaDipendente() {
    	return dipendenteProvider.getObject();
    }
    
    public Dipendente creaDipDefault(String nome,String reparto, Date dataAssunzione, String ruoloAziendale) {
    	Dipendente d = new Dipendente();
    	d.setNome(nome);
    	d.setReparto(reparto);
    	d.setDataAssunzione(dataAssunzione);
    	d.setRuoloAziendale(ruoloAziendale);
    	dipendenteRepository.save(d);
    	return d;
    }
    

    public List<Dipendente> findByRuoloAziendale(String ruoloAziendale) {
		return dipendenteRepository.findByRuoloAziendale(ruoloAziendale);
	}

	public List<Dipendente> findByReparto(String reparto) {
		return dipendenteRepository.findByReparto(reparto);
	}

	public List<Dipendente> findByRepartoAndRuoloAziendale(String reparto, String ruoloAziendale) {
		return dipendenteRepository.findByRepartoAndRuoloAziendale(reparto, ruoloAziendale);
	}

	public List<Dipendente> findAll() {
		return dipendenteRepository.findAll();
	}
	
	public List<Dipendente> getAllDipendenti() {
        return dipendenteRepository.findAll();
    }
	
	public Page<Dipendente> getAllPageable(Pageable pageable) {
		return dipendentePageRepo.findAll(pageable);
	}

	public Optional<Dipendente> findById(Long id) {
		return dipendenteRepository.findById(id);
	}

	public boolean existsById(Long id) {
		return dipendenteRepository.existsById(id);
	}

	public String deleteDipendenteById(Long id) {
		dipendenteRepository.deleteById(id);
		return "Contact deleted!!!";
	}

	public Dipendente getById(Long id) {
		return dipendenteRepository.getById(id);
	}

	public void deleteAll() {
		dipendenteRepository.deleteAll();
	}

	public Dipendente getDipendenteById(Long id) {
        return dipendenteRepository.findById(id).orElse(null);
    }

    public Dipendente createDipendente(Dipendente dipendente) {
        return dipendenteRepository.save(dipendente);
    }

    public Dipendente updateDipendente(Long id, Dipendente dipendente) {
        Dipendente existingDipendente = dipendenteRepository.findById(id).orElse(null);
        if (existingDipendente != null) {
            existingDipendente.setReparto(dipendente.getReparto());
            existingDipendente.setDataAssunzione(dipendente.getDataAssunzione());
            existingDipendente.setRuoloAziendale(dipendente.getRuoloAziendale());
            return dipendenteRepository.save(existingDipendente);
        }
        return null;
    }

    
    public <S extends Dipendente> S save(S entity) {
		return dipendenteRepository.save(entity);
	}

	@PreAuthorize("isAuthenticated()")
    public void metodoDipendente() {
        // Implementa le operazioni necessarie per un dipendente generico loggato.

        // Esempio: Recupera l'utente autenticato dal contesto di sicurezza
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String nomeUtente = authentication.getName();

        // Esempio: Recupera i dettagli del dipendente dal database o dal servizio
        Dipendente dipendente = dipendenteRepository.findByNome(nomeUtente);

        // Esempio: Effettua altre operazioni con il dipendente
        if (dipendente != null) {
            System.out.println("Ciao " + dipendente.getNome() + "! Benvenuto nel metodo dipendente.");
        }
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void metodoDipendenteAmministratore() {
        // Implementa le operazioni necessarie per un dipendente con ruolo admin.

        // Esempio: Effettua operazioni di amministrazione speciali
        System.out.println("Operazioni amministrative in corso...");

        // Esempio: Recupera l'utente autenticato dal contesto di sicurezza
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String nomeUtente = authentication.getName();

        // Esempio: Recupera i dettagli dell'utente amministratore dal database o dal servizio
        User user = userRepo.findByUsername(nomeUtente);

        // Esempio: Effettua altre operazioni per l'utente amministratore
        if (user != null) {
            // Esempio: Stampare dettagli dell'utente amministratore
            System.out.println("Dettagli dell'utente amministratore:");
            System.out.println("Nome utente: " + user.getUsername());
            System.out.println("Ruoli: " + user.getRoles());
        }
    }
    
    public void deleteDipendente(Long id) {
        dipendenteRepository.deleteById(id);
    }

    
    
}
