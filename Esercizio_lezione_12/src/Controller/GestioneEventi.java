package Controller;

import java.time.LocalDate;

import com.epicode.dao.EventoDAO;
import com.epicode.dao.LocationDAO;
import com.epicode.dao.PartecipazioneDao;
import com.epicode.dao.PersonaDAO;
import com.epicode.model.Evento;
import com.epicode.model.Location;
import com.epicode.model.Partecipazione;
import com.epicode.model.Persona;

import Enumerated.Sesso;
import Enumerated.StatoPartecipazione;
import Enumerated.TipoEvento;

public class GestioneEventi {

public static void main(String[] args) {
		
		Location location = saveLocation();
		Evento evento = saveEvento(location);
		Persona persona = savePersona();
		
		Partecipazione partecipazione = savePartecipazione(evento,persona);

	}



	private static Partecipazione savePartecipazione(Evento evento, Persona persona) {
		Partecipazione part = new Partecipazione();
		part.setEvento(evento);
		part.setPersona(persona);
		part.setStato(StatoPartecipazione.CONFERMATA);
		PartecipazioneDao partecipazioneDAO = new PartecipazioneDao();
		partecipazioneDAO.save(part);
		return part;
	}

	private static Persona savePersona() {
		Persona per = new Persona();
		per.setNome("Mario");
		per.setCognome("Rossi");
		per.setEmail("m.rossi@google.com");
		per.setSesso(Sesso.MASCHIO);
		per.setDataDiNascita(LocalDate.of(1980,9, 23));
		PersonaDAO personaDAO = new PersonaDAO();
		personaDAO.save(per);
		return per;
	}

	private static Location saveLocation() {
		Location loc = new Location();
		loc.setCitta("Firenze");
		loc.setNome("Stadio Franchi");
		
		LocationDAO locationDAO = new LocationDAO();
		locationDAO.save(loc);
		return loc;
	}

	private static Evento saveEvento(Location loc) {
		Evento ev = new Evento();
		ev.setDataEvento(LocalDate.now());
		ev.setTitolo("Partita");
		ev.setDescrizione("Finale di coppa");
		ev.setNumeroMassimoPartecipanti(10);
		ev.setTipoEvento(TipoEvento.PUBBLICO);
		ev.setLocation(loc);
		EventoDAO evDao = new EventoDAO();
		evDao.save(ev);

		return ev;
	}
	
}
