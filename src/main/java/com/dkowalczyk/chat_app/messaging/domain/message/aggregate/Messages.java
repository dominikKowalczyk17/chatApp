package com.dkowalczyk.chat_app.messaging.domain.message.aggregate;

import com.dkowalczyk.chat_app.shared.error.domain.Assert;

import java.util.List;

public record Messages(List<Message> messages) {

    public Messages {
        Assert.field("messages", messages).notNull().noNullElement();
    }
}
