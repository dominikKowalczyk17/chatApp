package com.dkowalczyk.chat_app.messaging.domain.message.vo;

import org.springframework.util.Assert;

import java.util.UUID;

public record MessagePublicId(UUID value) {

    public MessagePublicId {
        Assert.notNull(value, "ID cannot be null");
    }
}
