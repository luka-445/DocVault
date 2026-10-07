package ca.lukavincic.dms.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity 
@Table(name = "organizations")
public class Organization {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 128)
    private String name;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    public Organization() {}

    public Organization(String name)
    {
        this.name = name;
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

    public String getName()
    {
        return name;
    }

    public LocalDateTime getCreatedAt()
    {
        return createdAt;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCreatedAt(LocalDateTime createdAt)
    {
        this.createdAt = createdAt;
    }

}
