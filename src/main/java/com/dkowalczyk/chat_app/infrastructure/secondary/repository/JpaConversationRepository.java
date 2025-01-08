package com.dkowalczyk.chat_app.infrastructure.secondary.repository;

import com.dkowalczyk.chat_app.messaging.domain.message.aggregate.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaConversationRepository extends JpaRepository<Conversation, Long> {
}
