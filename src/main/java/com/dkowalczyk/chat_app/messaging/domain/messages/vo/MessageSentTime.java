package com.dkowalczyk.chat_app.messaging.domain.messages.vo;

import com.dkowalczyk.chat_app.shared.error.domain.Assert;

import java.time.Instant;

public record MessageSentTime(Instant date) {
    public MessageSentTime {
        Assert.field("date", date).notNull();
    }
}
