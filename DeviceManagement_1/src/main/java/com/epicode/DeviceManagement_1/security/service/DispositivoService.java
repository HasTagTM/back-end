package com.epicode.DeviceManagement_1.security.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.hibernate.mapping.Table;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.epicode.DeviceManagement_1.enumerated.StatoDispositivo;
import com.epicode.DeviceManagement_1.security.entity.Computer;
import com.epicode.DeviceManagement_1.security.entity.Dipendente;
import com.epicode.DeviceManagement_1.security.entity.Dispositivo;
import com.epicode.DeviceManagement_1.security.entity.Phone;
import com.epicode.DeviceManagement_1.security.entity.Tablet;
import com.epicode.DeviceManagement_1.security.repository.DispositivoRepoPageable;
import com.epicode.DeviceManagement_1.security.repository.IDipendenteRepository;
import com.epicode.DeviceManagement_1.security.repository.IDispositivoRepository;


@Service
public class DispositivoService {

	
	@Autowired @Qualifier("crea_tablet") ObjectProvider<Dispositivo> tabletProvider;
	@Autowired @Qualifier("crea_phone") ObjectProvider<Dispositivo> phoneProvider;
	@Autowired @Qualifier("crea_computer") ObjectProvider<Dispositivo> computerProvider;
    @Autowired IDispositivoRepository dispositivoRepository;
    @Autowired IDipendenteRepository dipendenteRepository;
    @Autowired DispositivoRepoPageable dispositivoPageRepo;
    
    public Dispositivo createDispositivo(Dispositivo dispositivo) {
        return dispositivoRepository.save(dispositivo);
    }
    
    public Dispositivo creaTablet() {
    	return tabletProvider.getObject();
    }
    
    public Dispositivo creaTabletDefault(StatoDispositivo stato, Dipendente dipendente, String name) {
    	Tablet t = new Tablet();
    	t.setStato(stato);
    	t.setDipendente(dipendente);
    	t.setName(name);
    	dispositivoRepository.save(t);
    	return t;
    }
    
    public Dispositivo creaPhone() {
    	return phoneProvider.getObject();
    }
    
	public Dispositivo creaPhoneDefault(StatoDispositivo stato, Dipendente dipendente, String name) {
    	Phone p = new Phone();
    	p.setStato(stato);
    	p.setDipendente(dipendente);
    	p.setName(name);
    	dispositivoRepository.save(p);
    	return p;
    }
    
    public Dispositivo creaComputer() {
    	return computerProvider.getObject();
    }
    
    public Dispositivo creaComputerDefault(StatoDispositivo stato, Dipendente dipendente, String name) {
    	Computer c = new Computer();
    	c.setStato(stato);
    	c.setDipendente(dipendente);
    	c.setName(name);
    	dispositivoRepository.save(c);
    	return c;
    }
    
    public Dispositivo updateDispositivo(Long id, Dispositivo dispositivo) {
    	Dispositivo existingDispositivo = dispositivoRepository.findById(id).orElse(null);
        if (existingDispositivo != null) {
        	existingDispositivo.setStato(dispositivo.getStato());
        	existingDispositivo.setDipendente(dispositivo.getDipendente());
            return dispositivoRepository.save(existingDispositivo);
        }
        return null;
    }

	public List<Dispositivo> findAll() {
		return dispositivoRepository.findAll();
	}

	public Optional<Dispositivo> findById(Long id) {
		return dispositivoRepository.findById(id);
	}

	public boolean existsById(Long id) {
		return dispositivoRepository.existsById(id);
	}

	public void deleteById(Long id) {
		dispositivoRepository.deleteById(id);
	}

	public Dispositivo getById(Long id) {
		return dispositivoRepository.getById(id);
	}

	public void delete(Dispositivo entity) {
		dispositivoRepository.delete(entity);
	}

	public void deleteAll() {
		dispositivoRepository.deleteAll();
	}

	public List<Dispositivo> getAllDispositivi() {
        return dispositivoRepository.findAll();
    }
	
	public Page<Dispositivo> getAllPageable(Pageable pageable) {
		return dispositivoPageRepo.findAll(pageable);
	}

    public Dispositivo getDispositivoById(Long id) {
        return dispositivoRepository.findById(id).orElse(null);
    }

    public String deleteDispositivoById(Long id) {
		dispositivoRepository.deleteById(id);
		return "dispositivo deleted!!!";
	}

    public boolean assegnaDispositivoADipendente(Long dispositivoId, Long dipendenteId) {
        Dispositivo dispositivo = dispositivoRepository.findById(dispositivoId).orElse(null);
        Dipendente dipendente = dipendenteRepository.findById(dipendenteId).orElse(null);

        if (dispositivo != null && dipendente != null) {
            if (dispositivo.getStato().equals(StatoDispositivo.DISPONIBILE)) {
                dispositivo.setStato(StatoDispositivo.ASSEGNATO);
                dispositivo.setDipendente(dipendente);
                dispositivoRepository.save(dispositivo);
                return true;
            }
        }
        return false;
    }

    public void rimuoviAssegnazioneDispositivo(Long dispositivoId) {
        Dispositivo dispositivo = dispositivoRepository.findById(dispositivoId).orElse(null);
        if (dispositivo != null && dispositivo.getStato().equals(StatoDispositivo.ASSEGNATO)) {
            dispositivo.setStato(StatoDispositivo.DISPONIBILE);
            dispositivo.setDipendente(null);
            dispositivoRepository.save(dispositivo);
        }
    }


}
