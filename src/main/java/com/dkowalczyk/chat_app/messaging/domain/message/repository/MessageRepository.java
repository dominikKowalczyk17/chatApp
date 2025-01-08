package com.dkowalczyk.chat_app.messaging.domain.message.repository;

import com.dkowalczyk.chat_app.messaging.domain.message.aggregate.Conversation;
import com.dkowalczyk.chat_app.messaging.domain.message.aggregate.Message;
import com.dkowalczyk.chat_app.messaging.domain.message.vo.ConversationPublicId;
import com.dkowalczyk.chat_app.messaging.domain.message.vo.MessageSendState;
import com.dkowalczyk.chat_app.messaging.domain.user.aggreagate.User;
import com.dkowalczyk.chat_app.messaging.domain.user.vo.UserPublicId;

import java.util.List;

public interface MessageRepository {
    Message save(Message message, User sender, Conversation conversation);

    int updateMessageSendState(ConversationPublicId conversationPublicId, UserPublicId userPublicId, MessageSendState state);

    List<Message> findMessageToUpdateSendState(ConversationPublicId conversationPublicId, UserPublicId userPublicId);
}
