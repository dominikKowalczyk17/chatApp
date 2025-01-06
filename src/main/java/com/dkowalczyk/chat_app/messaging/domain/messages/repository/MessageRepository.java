package com.dkowalczyk.chat_app.messaging.domain.messages.repository;

import com.dkowalczyk.chat_app.messaging.domain.messages.aggregate.Conversation;
import com.dkowalczyk.chat_app.messaging.domain.messages.aggregate.Message;
import com.dkowalczyk.chat_app.messaging.domain.messages.vo.ConversationPublicId;
import com.dkowalczyk.chat_app.messaging.domain.messages.vo.MessageSendState;
import com.dkowalczyk.chat_app.messaging.domain.user.aggreagate.User;
import com.dkowalczyk.chat_app.messaging.domain.user.vo.UserPublicId;

import java.util.List;

public interface MessageRepository {
    Message save(Message message, User user, Conversation conversation);

    int updateMessageSendState(ConversationPublicId conversationPublicId, UserPublicId userPublicId, MessageSendState messageSendState);

    List<Message> findMessageToUpdateSendState(ConversationPublicId conversationPublicId, UserPublicId userPublicId);
}
