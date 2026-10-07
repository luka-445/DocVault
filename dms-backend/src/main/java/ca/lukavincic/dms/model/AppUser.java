package ca.lukavincic.dms.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity 
@Table(name = "users")
public class AppUser {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "organization_id", nullable = false)
    private Organization organization;

    @Column(nullable = false, unique = true, length = 256)
    private String email;

    @Column(nullable = false, length = 256)
    private String passwordHash;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private Role role;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    public AppUser() {}

    public AppUser(Organization organization, String email, String passwordHash, Role role)
    {
        this.organization = organization;
        this.email = email;
        this.passwordHash = passwordHash;
        this.role = role;
        this.createdAt = LocalDateTime.now();
    }

    @PrePersist 
    protected void onCreate()
    {
        if (createdAt == null)
        {
            createdAt = LocalDateTime.now();
        }
    }

    public Long getId()
    {
        return id;
    }

    public Organization getOrganization()
    {
        return organization;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPasswordHash()
    {
        return passwordHash;
    }

    public Role getRole()
    {
        return role;
    }

    public LocalDateTime getCreatedAt()
    {
        return createdAt;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setOrganization(Organization organization)
    {
        this.organization = organization;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPasswordHash(String passwordHash)
    {
        this.passwordHash = passwordHash;
    }

    public void setRole(Role role)
    {
        this.role = role;
    }

    public void setCreatedAt(LocalDateTime createdAt)
    {
        this.createdAt = createdAt;
    }
}
