package com.dkowalczyk.chat_app.messaging.domain.user.vo;

import com.dkowalczyk.chat_app.shared.error.domain.Assert;

public record UserEmail(String value) {

    public UserEmail {
        Assert.field(value, value).maxLength(255);
    }
}
