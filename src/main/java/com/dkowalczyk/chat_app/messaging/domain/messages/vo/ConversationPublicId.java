package com.dkowalczyk.chat_app.messaging.domain.messages.vo;

import com.dkowalczyk.chat_app.shared.error.domain.Assert;

import java.io.Serializable;
import java.util.UUID;

public record ConversationPublicId(UUID value) {
    public ConversationPublicId {
        Assert.notNull(value, "conversation cannot be null");
    }
}
