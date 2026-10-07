package ca.lukavincic.dms.dto;

public class LoginResponse {
        private Long userId;
    private Long organizationId;
    private String email;
    private String role;
    private String message;

    public LoginResponse(Long userId, Long organizationId, String email, String role, String message)
    {
        this.userId = userId;
        this.organizationId = organizationId;
        this.email = email;
        this.role = role;
        this.message = message;
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
