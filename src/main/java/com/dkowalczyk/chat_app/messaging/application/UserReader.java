package com.dkowalczyk.chat_app.messaging.application;

import com.dkowalczyk.chat_app.messaging.domain.user.aggreagate.User;
import com.dkowalczyk.chat_app.messaging.domain.user.repository.UserRepository;
import com.dkowalczyk.chat_app.messaging.domain.user.vo.UserEmail;

import java.util.Optional;

public class UserReader {

    private final UserRepository userRepository;

    public UserReader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getByEmail(UserEmail email) {
        return userRepository.getOneByEmail(email);
    }
}
