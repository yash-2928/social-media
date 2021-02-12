package demo.login.payload.response;

import java.util.List;

public class JwtResponse {
   
    private String token;
    private String type = "Bearer";
    private String email;
    private Long enrollmentNo;
    private List<String> roles;

    public JwtResponse(String accessToken, String email, Long enrollmentNo, List<String> roles) {
        this.token = accessToken;
        this.email = email;
        this.enrollmentNo = enrollmentNo;
        this.roles = roles;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String token) {
        this.token = token;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String type) {
        this.type = type;
    }

    public Long getEnrollmentNo() {
        return enrollmentNo;
    }

    public void setEnrollmentNo(Long enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
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
}
