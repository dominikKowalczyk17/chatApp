package com.dkowalczyk.chat_app.messaging.domain.messages.vo;

import com.dkowalczyk.chat_app.shared.error.domain.Assert;

import java.util.UUID;

public record MessagePublicId(UUID value) {

    public MessagePublicId {
        Assert.notNull(value, "ID cannot be null");
    }
}
