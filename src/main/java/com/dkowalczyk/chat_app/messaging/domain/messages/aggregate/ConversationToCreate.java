package com.dkowalczyk.chat_app.messaging.domain.messages.aggregate;

import com.dkowalczyk.chat_app.messaging.domain.messages.vo.ConversationName;
import com.dkowalczyk.chat_app.messaging.domain.user.vo.UserPublicId;
import com.dkowalczyk.chat_app.shared.error.domain.Assert;
import org.jilt.Builder;

import java.util.Set;

@Builder
public class ConversationToCreate {
    private final Set<UserPublicId> members;
    private final ConversationName name;

    public ConversationToCreate(Set<UserPublicId> members, ConversationName name) {
        assertMandatoryFields(members, name);
        this.members = members;
        this.name = name;
    }

    private void assertMandatoryFields(Set<UserPublicId> members, ConversationName name) {
        Assert.notNull("name", name);
        Assert.notNull("members", members);
    }
}
