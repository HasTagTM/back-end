package com.epicode.GestionePrenotazioni.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.GestionePrenotazioni.enumerated.TipoPostazione;
import com.epicode.GestionePrenotazioni.models.Edificio;
import com.epicode.GestionePrenotazioni.models.Postazione;
import com.epicode.GestionePrenotazioni.models.Prenotazione;
import com.epicode.GestionePrenotazioni.models.Utente;
import com.epicode.GestionePrenotazioni.services.EdificioService;
import com.epicode.GestionePrenotazioni.services.PostazioneService;
import com.epicode.GestionePrenotazioni.services.PrenotazioneService;
import com.epicode.GestionePrenotazioni.services.UtenteService;

@Component
public class PrenotazioneRunner implements CommandLineRunner {

    @Autowired
    private PrenotazioneService prenotazioneSvc;
    @Autowired
    private PostazioneService postazioneSvc;
    @Autowired
    private EdificioService edificioSvc;
    @Autowired
    private UtenteService utenteSvc;

    @Override
    public void run(String... args) throws Exception {

        Edificio ed = edificioSvc.creaEdificio("PortaMurata", "Via delle Castiglie", "Ancona");
        Edificio ed1 = edificioSvc.creaEdificio("Guastalla", "Via Simonazzi", "ReggioEmilia");
        Utente utente = utenteSvc.creaUtente("Maros", "Mario Rossi", "mario.rossi@example.com");
        Utente utente1 = utenteSvc.creaUtente("Nicolas", "Nicolas Verdi", "nicolas.verdi@example.com");
        Utente utente2 = utenteSvc.creaUtente("Has", "Hassan Sahraoui", "hassan.sahraoui@example.com");
        Postazione ps = postazioneSvc.creaPostazione("DJ446SDD66", "POSTAZIONE: sala pesi", TipoPostazione.PRIVATO, 3, ed);
        Postazione ps1 = postazioneSvc.creaPostazione("DJ446S545DD66", "POSTAZIONE: sala riunioni", TipoPostazione.SALA_RIUNIONI, 10, ed1);
        Prenotazione prenotazione = prenotazioneSvc.creaPrenotazione(LocalDate.now(), utente, ps);
        Prenotazione prenotazione1 = prenotazioneSvc.creaPrenotazione(LocalDate.now(), utente2, ps1);
        LocalDate dataPrenotazione1 = LocalDate.now();
        Prenotazione prenotazione2 = prenotazioneSvc.creaPrenotazione(dataPrenotazione1, utente, ps);

        // Verifica se l'utente può prenotare una postazione per una data specifica
        LocalDate dataPrenotazione2 = LocalDate.of(2023, 7, 21);
        if (prenotazioneSvc.canPrenotarePostazione(utente, dataPrenotazione2)) {
            // Se l'utente può prenotare, crea la prenotazione
            Prenotazione prenotazione3 = prenotazioneSvc.creaPrenotazione(dataPrenotazione2, utente, ps1);
            if (prenotazione3 != null) {
                System.out.println("Prenotazione creata con successo.");
            } else {
                System.out.println("Errore durante la creazione della prenotazione.");
            }
        } else {
            System.out.println("L'utente " + utente.getUserName() + " ha già una prenotazione per la data " + dataPrenotazione2);
        }

        // Verifica se l'utente può prenotare una postazione per un'altra data specifica (dataPrenotazione3)
        LocalDate dataPrenotazione3 = LocalDate.of(2023, 7, 22);
        if (prenotazioneSvc.canPrenotarePostazione(utente, dataPrenotazione3)) {
            // Se l'utente può prenotare, crea la prenotazione
            Prenotazione prenotazione4 = prenotazioneSvc.creaPrenotazione(dataPrenotazione3, utente, ps1);
            if (prenotazione4 != null) {
                System.out.println("Prenotazione creata con successo.");
            } else {
                System.out.println("Errore durante la creazione della prenotazione.");
            }
        } else {
            System.out.println("L'utente " + utente.getUserName() + " ha già una prenotazione per la data " + dataPrenotazione3);
        }

        prenotazioneSvc.deletePrenotazioniByPostazione(ps);
        prenotazioneSvc.delete(ps);
        utenteSvc.findById(1l);
    }

}
