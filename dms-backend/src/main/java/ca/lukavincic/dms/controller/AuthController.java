package ca.lukavincic.dms.controller;

import org.springframework.web.bind.annotation.*;
import ca.lukavincic.dms.dto.RegisterRequest;
import ca.lukavincic.dms.dto.RegisterResponse;
import ca.lukavincic.dms.dto.LoginRequest;
import ca.lukavincic.dms.dto.LoginResponse;
import ca.lukavincic.dms.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService)
    {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest request)
    {
        RegisterResponse response = authService.register(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request)
    {
        LoginResponse response = authService.login(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/me")
    public ResponseEntity<Map<String, String>> me(Authentication authentication) 
    {
        return ResponseEntity.ok(Map.of("email", authentication.getName()));
    }
}
