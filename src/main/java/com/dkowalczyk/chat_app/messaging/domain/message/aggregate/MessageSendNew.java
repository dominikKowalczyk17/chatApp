package com.dkowalczyk.chat_app.messaging.domain.message.aggregate;

import com.dkowalczyk.chat_app.messaging.domain.message.vo.ConversationPublicId;
import com.dkowalczyk.chat_app.messaging.domain.message.vo.MessageContent;
import org.jilt.Builder;

@Builder
public record MessageSendNew(MessageContent messageContent,
                             ConversationPublicId conversationPublicId) {
}
