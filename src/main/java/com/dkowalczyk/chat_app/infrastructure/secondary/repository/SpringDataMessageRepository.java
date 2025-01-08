package com.dkowalczyk.chat_app.infrastructure.secondary.repository;

import com.dkowalczyk.chat_app.messaging.domain.message.aggregate.Conversation;
import com.dkowalczyk.chat_app.messaging.domain.message.aggregate.Message;
import com.dkowalczyk.chat_app.messaging.domain.message.repository.MessageRepository;
import com.dkowalczyk.chat_app.messaging.domain.message.vo.ConversationPublicId;
import com.dkowalczyk.chat_app.messaging.domain.message.vo.MessageSendState;
import com.dkowalczyk.chat_app.messaging.domain.user.aggreagate.User;
import com.dkowalczyk.chat_app.messaging.domain.user.vo.UserPublicId;

import java.util.List;

public class SpringDataMessageRepository implements MessageRepository {
    @Override
    public Message save(Message message, User sender, Conversation conversation) {
        return null;
    }

    @Override
    public int updateMessageSendState(ConversationPublicId conversationPublicId, UserPublicId userPublicId, MessageSendState state) {
        return 0;
    }

    @Override
    public List<Message> findMessageToUpdateSendState(ConversationPublicId conversationPublicId, UserPublicId userPublicId) {
        return List.of();
    }
}
