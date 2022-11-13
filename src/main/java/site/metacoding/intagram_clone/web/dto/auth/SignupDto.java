package site.metacoding.intagram_clone.web.dto.auth;

import org.springframework.security.core.userdetails.User;

import lombok.Data;

@Data
public class SignupDto {
    private String username;
    private String password;
    private String email;
    private String name;

    public site.metacoding.intagram_clone.domain.user.User toEntity() {
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();
    }
}
