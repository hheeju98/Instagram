package site.metacoding.intagram_clone.web.dto.auth;

import lombok.Data;

@Data
public class SignupDto {
    private String username;
    private String password;
    private String email;
    private String name;
}
