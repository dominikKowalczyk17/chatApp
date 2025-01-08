package com.dkowalczyk.chat_app.infrastructure.secondary.repository;

import com.dkowalczyk.chat_app.infrastructure.secondary.entity.MessageContentBinaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMessageBinaryContent extends JpaRepository<MessageContentBinaryEntity, Long> {
}
