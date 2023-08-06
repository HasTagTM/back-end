package com.epicode.DeviceManagement.security.service;

import com.epicode.DeviceManagement.security.payload.LoginDto;
import com.epicode.DeviceManagement.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
