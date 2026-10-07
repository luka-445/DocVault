package ca.lukavincic.dms.dto;

public class RegisterResponse {
    private Long userId;
    private Long organizationId;
    private String email;
    private String role;

    public RegisterResponse(Long userId, Long organizationId, String email, String role)
    {
        this.userId = userId;
        this.organizationId = organizationId;
        this.email = email;
        this.role = role;
    }

    public Long getUserId()
    {
        return userId;
    }

    public Long getOrganizationId()
    {
        return organizationId;
    }

    public String getEmail()
    {
        return email;
    }

    public String getRole()
    {
        return role;
    }
}
