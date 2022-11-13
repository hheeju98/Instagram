package site.metacoding.intagram_clone.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.intagram_clone.domain.user.User;
import site.metacoding.intagram_clone.domain.user.UserRepository;

@RequiredArgsConstructor
@Service
public class AuthService {

    private final UserRepository userRepository;

    public User 회원가입(User user) {
        // 회원가입 진행
        User userEntity = userRepository.save(user);

        return userEntity;
    }
}
