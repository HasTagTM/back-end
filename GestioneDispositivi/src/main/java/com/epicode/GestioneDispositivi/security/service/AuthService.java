package com.epicode.GestioneDispositivi.security.service;

import com.epicode.GestioneDispositivi.security.payload.LoginDto;
import com.epicode.GestioneDispositivi.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
