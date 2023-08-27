package com.epicode.Gestione_incendi.security.service;

import com.epicode.Gestione_incendi.security.payload.LoginDto;
import com.epicode.Gestione_incendi.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
