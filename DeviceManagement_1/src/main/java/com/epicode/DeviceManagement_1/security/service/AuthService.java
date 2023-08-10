package com.epicode.DeviceManagement_1.security.service;

import com.epicode.DeviceManagement_1.security.payload.LoginDto;
import com.epicode.DeviceManagement_1.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
