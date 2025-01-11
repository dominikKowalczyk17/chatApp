package com.dkowalczyk.chat_app.messaging.application;

import com.dkowalczyk.chat_app.messaging.domain.user.aggreagate.User;
import com.dkowalczyk.chat_app.messaging.domain.user.repository.UserRepository;
import com.dkowalczyk.chat_app.messaging.domain.user.service.UserSynchronizer;
import com.dkowalczyk.chat_app.messaging.domain.user.vo.UserEmail;
import com.dkowalczyk.chat_app.shared.authentication.application.AuthenticatedUser;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserApplicationService {

    private final UserSynchronizer userSynchronizer;
    private final UserReader userReader;

    public UserApplicationService(UserRepository userRepository) {
        this.userSynchronizer = new UserSynchronizer(userRepository);
        this.userReader = new UserReader(userRepository);
    }

    @Transactional
    public User getAuthenticatedUserWithSync(Jwt oauth2User, boolean forceResync) {
        userSynchronizer.syncWithIdp(oauth2User, forceResync);
        return userReader.getByEmail(new UserEmail(AuthenticatedUser.username().get())).orElseThrow();
    }
}
