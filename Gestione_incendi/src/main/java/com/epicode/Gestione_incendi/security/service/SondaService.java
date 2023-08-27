package com.epicode.Gestione_incendi.security.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.epicode.Gestione_incendi.security.entity.Sonda;
import com.epicode.Gestione_incendi.security.repository.SondaRepository;


import jakarta.persistence.EntityNotFoundException;

@Service
public class SondaService {

	@Autowired SondaRepository sondaRepo;
	@Autowired @Qualifier("creaSonda") private ObjectProvider<Sonda> sondaProvider;
	private final RestTemplate restTemplate = new RestTemplate();
	private final String microserviceUrl = "http://localhost:8082";
	
	public Sonda creaSonda(double latitudine, double longitudine, int smokeLevel) {
		Sonda sonda = sondaProvider.getObject();
		sonda.setLatitudine(latitudine);
		sonda.setLongitudine(longitudine);
		sonda.setSmokeLevel(smokeLevel);
		sondaRepo.save(sonda);
		return sonda;
	}
	
	public void rilevaIncendio(String sondaId, int smokeLevel) {
        if (smokeLevel > 5) {
            inviaAllarmeAlMicroservizio(sondaId);
        }
    }

    private void inviaAllarmeAlMicroservizio(String sondaId) {
        String url = microserviceUrl + "/allarme/" + sondaId;
        restTemplate.postForEntity(url, null, Void.class);
    }
	
	
	// Metodo getAll che utilizza il repository CrudRepository
		public List<Sonda> getAllSonde(){
			return sondaRepo.findAll();
		}
		
		public Sonda sondaId(Long id) {
			if(!sondaRepo.existsById(id)) {
				throw new EntityNotFoundException("Sonda not exists!!!");
			}
			return sondaRepo.findById(id).get();
		}
		
		public Sonda creaSonda(Sonda u) {
			return sondaRepo.save(u);
		}
		
		public Sonda modificaSondaPerId(Long id, Sonda sonda) throws Exception{
			if(!sondaRepo.existsById(id)) {
				throw new EntityNotFoundException("Sonda not exists!!!");
			}
			if(id != sonda.getId()) {
				throw new Exception("Id and sonda do not match");
			}
			return sondaRepo.save(sonda);
		}
		
		public String deleteById(Long id) {
			if(!sondaRepo.existsById(id)) {
				throw new EntityNotFoundException("Sonda not exists!!!");
			}
			Sonda u = sondaId(id);
			sondaRepo.delete(u);
			return "sonda eliminata con successo!";
		}

	
	
}
