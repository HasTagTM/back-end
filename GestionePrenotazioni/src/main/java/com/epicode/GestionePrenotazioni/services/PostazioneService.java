package com.epicode.GestionePrenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.GestionePrenotazioni.enumerated.TipoPostazione;
import com.epicode.GestionePrenotazioni.models.Edificio;
import com.epicode.GestionePrenotazioni.models.Postazione;
import com.epicode.GestionePrenotazioni.repository.IEdificioRepository;
import com.epicode.GestionePrenotazioni.repository.IPostazioneRepository;

@Service
public class PostazioneService {

	@Autowired @Qualifier("crea_postazione") ObjectProvider<Postazione> postazioneProvider;
	@Autowired IPostazioneRepository postazioneRepo;
	@Autowired IEdificioRepository edificioRepo;
	
	public Postazione creaPostazione(String codiceUnivoco, String descrizione, TipoPostazione tipo, int numeroMassimoOccupanti,
			Edificio edificio) {
		Postazione ps = postazioneProvider.getObject();
		ps.setCodiceUnivoco(codiceUnivoco);
		ps.setDescrizione(descrizione);
		ps.setTipo(tipo);
		ps.setNumeroMassimoOccupanti(numeroMassimoOccupanti);
		ps.setEdificio(edificio);
		edificioRepo.save(edificio);
		postazioneRepo.save(ps);
		System.out.println("POSTAZIONE COD: " + ps.getCodiceUnivoco() + " DESCRIZIONE: " + ps.getDescrizione() +  " EDIFICIO " + edificio.getNome() + "." + " postazione creata con successo");
		return ps;
	}
	
	public List<Postazione> findAll() {
		return (List<Postazione>) postazioneRepo.findAll();
	}

	public void updateUtente(Postazione p) {
		postazioneRepo.save(p);
		System.out.println("utente aggiornato");
	}

    public List<Postazione> findByTipoAndCity(TipoPostazione tipo, String city) {
        return postazioneRepo.findByTipoAndEdificio_City(tipo, city);
    }

	public String findById(Long id) {
		return edificioRepo.findById(id).get().getNome().toString();
	}
	
	public void deleteById(Long id) {
		edificioRepo.deleteById(id);
		System.out.println("postazione eliminata");
	}

	public void delete(Edificio ed) {
		edificioRepo.delete(ed);
		System.out.println("potazione eliminata tramite edificio");
	}

	public void deleteAll() {
		edificioRepo.deleteAll();
		System.out.println("postazioni eliminate");
	}
	
}
