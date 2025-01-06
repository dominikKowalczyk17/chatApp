package com.dkowalczyk.chat_app.messaging.domain.messages.aggregate;

import com.dkowalczyk.chat_app.messaging.domain.messages.vo.ConversationPublicId;
import com.dkowalczyk.chat_app.messaging.domain.messages.vo.MessageContent;

public record MessageSendNew(MessageContent messageContent, ConversationPublicId conversationPublicId) {
}
