package com.dkowalczyk.chat_app.infrastructure.secondary.repository;

import com.dkowalczyk.chat_app.infrastructure.secondary.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMessageRepository extends JpaRepository<MessageEntity, Long> {
}
