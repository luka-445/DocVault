package ca.lukavincic.dms.service;

import ca.lukavincic.dms.dto.RegisterRequest;
import ca.lukavincic.dms.dto.RegisterResponse;

public interface AuthService {
    
    RegisterResponse register(RegisterRequest request);
}
