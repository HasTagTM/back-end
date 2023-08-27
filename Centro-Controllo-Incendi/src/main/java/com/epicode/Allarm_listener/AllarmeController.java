package com.epicode.Allarm_listener;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/allarme")
public class AllarmeController {

	@PostMapping("/{sondaId}")
    public ResponseEntity<String> segnalaAllarme(@PathVariable String sondaId) {
        System.out.println("Allarme scatenato per la sonda: " + sondaId);
        return ResponseEntity.ok("Allarme segnalato");
    }
	
}
