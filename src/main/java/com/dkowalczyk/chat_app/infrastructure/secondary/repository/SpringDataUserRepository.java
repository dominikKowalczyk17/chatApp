package com.dkowalczyk.chat_app.infrastructure.secondary.repository;

import com.dkowalczyk.chat_app.messaging.domain.message.vo.ConversationPublicId;
import com.dkowalczyk.chat_app.messaging.domain.user.aggreagate.User;
import com.dkowalczyk.chat_app.messaging.domain.user.repository.UserRepository;
import com.dkowalczyk.chat_app.messaging.domain.user.vo.UserEmail;
import com.dkowalczyk.chat_app.messaging.domain.user.vo.UserPublicId;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Repository
public class SpringDataUserRepository implements UserRepository {

    @Override
    public void save(User user) {

    }

    @Override
    public Optional<User> get(UserPublicId userPublicId) {
        return Optional.empty();
    }

    @Override
    public Optional<User> getOneByEmail(UserEmail userEmail) {
        return Optional.empty();
    }

    @Override
    public List<User> getByPublicIds(List<UserPublicId> userPublicIds) {
        return List.of();
    }

    @Override
    public Page<User> search(Pageable pageable, String query) {
        return null;
    }

    @Override
    public int updateLastSeenByPublicId(UserPublicId userPublicId, Instant lastSeen) {
        return 0;
    }

    @Override
    public List<User> getRecipientByConversationIdExcludingReader(ConversationPublicId conversationPublicId, UserPublicId readerPublicId) {
        return List.of();
    }

    @Override
    public Optional<User> getOneByPublicId(UserPublicId userPublicId) {
        return Optional.empty();
    }
}
