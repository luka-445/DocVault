package ca.lukavincic.dms.service;

import ca.lukavincic.dms.dto.RegisterRequest;
import ca.lukavincic.dms.dto.RegisterResponse;
import ca.lukavincic.dms.model.AppUser;
import ca.lukavincic.dms.model.Organization;
import ca.lukavincic.dms.model.Role;
import ca.lukavincic.dms.repository.AppUserRepository;
import ca.lukavincic.dms.repository.OrganizationRepository;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class AuthServiceImpl implements AuthService {
    private final AppUserRepository appUserRepository;
    private final OrganizationRepository organizationRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthServiceImpl(AppUserRepository appUserRepository, OrganizationRepository organizationRepository, PasswordEncoder passwordEncoder)
    {
        this.appUserRepository = appUserRepository;
        this.organizationRepository = organizationRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override 
    public RegisterResponse register(RegisterRequest request)
    {
        if (appUserRepository.existsByEmail(request.getEmail()))
        {
            throw new RuntimeException("Email is already registered.");
        }

        Organization organization = new Organization(request.getOrganizationName());
        organizationRepository.save(organization);

        AppUser user = new AppUser(organization, 
            request.getEmail(), 
            passwordEncoder.encode(request.getPassword()), 
            Role.ORG_ADMIN);

        appUserRepository.save(user);

        return new RegisterResponse(user.getId(), organization.getId(), user.getEmail(), user.getRole().name());
    }
}
