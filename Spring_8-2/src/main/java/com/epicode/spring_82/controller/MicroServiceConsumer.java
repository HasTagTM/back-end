package com.epicode.spring_82.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/os")
public class MicroServiceConsumer {

	@GetMapping("/get-string")
	public String stampaRes() {
		RestTemplate rt = new RestTemplate();
		String url = "http://localhost:8081/app/data1";
		ResponseEntity<String> response = rt.getForEntity(url, String.class);
		return "risposta: " + response.getBody();
	}
	
	@GetMapping("/get-people")
	public String stampaArrConsole() {
		RestTemplate rt = new RestTemplate();
		String url = "http://localhost:8081/app/data3";
		ResponseEntity<String> response = rt.getForEntity(url, String.class);
		return response.toString();
	}
	
	@GetMapping("/get-people-json")
	public Object stampaArr() {
		RestTemplate rt = new RestTemplate();
		String url = "http://localhost:8081/app/data2";
		Object response = rt.getForObject(url, Object.class);
		return response;
	}
	

}
