package com.dkowalczyk.chat_app.messaging.domain.messages.aggregate;

import com.dkowalczyk.chat_app.shared.error.domain.Assert;

import java.util.List;

public record Conversations(List<Conversation> conversations) {

    public Conversations {
        Assert.field("conversations", conversations).notNull().noNullElement();
    }

    @Override
    public List<Conversation> conversations() {
        return conversations;
    }
}
