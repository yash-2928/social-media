package demo.login.payload.response;

import java.util.List;

public class JwtResponse {

    private String accessToken;
    private String type = "Bearer";
    private String email;
    private Long userId;
    private List<String> roles;

    public JwtResponse(String accessToken, String email, Long userId, List<String> roles) {
        this.accessToken = accessToken;
        this.email = email;
        this.userId = userId;
        this.roles = roles;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String type) {
        this.type = type;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
