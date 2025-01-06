package com.dkowalczyk.chat_app.messaging.domain.user.vo;

import com.dkowalczyk.chat_app.shared.error.domain.Assert;

public record UserFirstName(String value) {

    public UserFirstName {
        Assert.field(value, value).maxLength(255);
    }
}
