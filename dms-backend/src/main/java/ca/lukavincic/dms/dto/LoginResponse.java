package ca.lukavincic.dms.dto;

public class LoginResponse {
    private String token;
    private Long userId;
    private Long organizationId;
    private String email;
    private String role;
    private String message;

    public LoginResponse(String token, Long userId, Long organizationId, String email, String role, String message)
    {
        this.token = token;
        this.userId = userId;
        this.organizationId = organizationId;
        this.email = email;
        this.role = role;
        this.message = message;
    }

    public String getToken()
    {
        return token;
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

    public String getMessage()
    {
        return message;
    }
}
