package com.dkowalczyk.chat_app.messaging.domain.user.vo;

import com.dkowalczyk.chat_app.shared.error.domain.Assert;

public record AuthorityName(String name) {
    public AuthorityName {
        Assert.field(name, "name").notBlank();
    }
}
