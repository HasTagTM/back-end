package com.epicode.spring_81.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

	private String name;
	private String lastname;
	private String username;
	private String city;
	
}
