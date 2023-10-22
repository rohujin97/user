package com.plav.user.service;

import com.plav.user.entity.User;
import com.plav.user.repository.UserRepository;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class JoinService {

    private final UserRepository userRepository;

    public void joinUser(User user) {
        if (Objects.isNull(user)) {
            log.error("User not found");
            throw new IllegalArgumentException("유저 정보가 없습니다.");
        }
        userRepository.save(user);
        log.info("user: {}", user);
    }
}
