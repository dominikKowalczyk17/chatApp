package com.dkowalczyk.chat_app.messaging.domain.user.repository;

import com.dkowalczyk.chat_app.messaging.domain.message.vo.ConversationPublicId;
import com.dkowalczyk.chat_app.messaging.domain.user.aggreagate.User;
import com.dkowalczyk.chat_app.messaging.domain.user.vo.UserEmail;
import com.dkowalczyk.chat_app.messaging.domain.user.vo.UserPublicId;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

public interface UserRepository {

    void save(User user);

    Optional<User> get(UserPublicId userPublicId);

    Optional<User> getOneByEmail(UserEmail userEmail);

    List<User> getByPublicIds(List<UserPublicId> userPublicIds);

    Page<User> search(Pageable pageable, String query);

    int updateLastSeenByPublicId(UserPublicId userPublicId, Instant lastSeen);

    List<User> getRecipientByConversationExcludingReader(ConversationPublicId conversationPublicId, UserPublicId readerPublicId);

    Optional<User> getOneByPublicId(UserPublicId userPublicId);
}
