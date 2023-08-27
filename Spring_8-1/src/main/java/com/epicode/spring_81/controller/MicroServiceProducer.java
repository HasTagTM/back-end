package com.epicode.spring_81.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.spring_81.model.User;

@RestController
@RequestMapping("/app")
public class MicroServiceProducer {

	
	@GetMapping("/data1")
	public String response() {
		return "collegamento avvenuto con successo";
	}
	
	@GetMapping("/data2")
	public ResponseEntity<List<User>> arrUser(){
		List users = new ArrayList<User>();
		users.add(new User("Hassan", "Sahraoui", "has_tag", "reggio-emilia"));
		users.add(new User("Mohammed", "Sahraoui", "moh_tag", "Marocco"));
		users.add(new User("Brahim", "Sahraoui", "bra_tag", "Francia"));
		users.add(new User("Oussama", "Rahemraoui", "ous_tag", "Pordenone"));
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	@GetMapping("/data3")
	public String arrUsers(){
		List users = new ArrayList<User>();
		users.add(new User("Hassan", "Sahraoui", "has_tag", "reggio-emilia"));
		users.add(new User("Mohammed", "Sahraoui", "moh_tag", "Marocco"));
		users.add(new User("Brahim", "Sahraoui", "bra_tag", "Francia"));
		users.add(new User("Oussama", "Rahemraoui", "ous_tag", "Pordenone"));
		return  users.toString();
	}
	
}
	