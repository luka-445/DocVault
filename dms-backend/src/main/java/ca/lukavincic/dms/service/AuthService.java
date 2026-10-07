package ca.lukavincic.dms.service;

import ca.lukavincic.dms.dto.RegisterRequest;
import ca.lukavincic.dms.dto.RegisterResponse;
import ca.lukavincic.dms.dto.LoginRequest;
import ca.lukavincic.dms.dto.LoginResponse;

public interface AuthService {
    
    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);
}
