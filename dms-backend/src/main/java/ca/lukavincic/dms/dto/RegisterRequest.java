package ca.lukavincic.dms.dto;

public class RegisterRequest {
    private String organizationName;
    private String email;
    private String password;

    public RegisterRequest() {}

    public String getOrganizationName()
    {
        return organizationName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setOrganizationName(String organizationName)
    {
        this.organizationName = organizationName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
