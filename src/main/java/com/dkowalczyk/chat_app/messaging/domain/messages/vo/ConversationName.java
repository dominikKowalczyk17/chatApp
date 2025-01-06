package com.dkowalczyk.chat_app.messaging.domain.messages.vo;

import com.dkowalczyk.chat_app.shared.error.domain.Assert;

public record ConversationName(String name) {

    public ConversationName {
        Assert.field("name", name).minLength(3).maxLength(255);
    }
}
