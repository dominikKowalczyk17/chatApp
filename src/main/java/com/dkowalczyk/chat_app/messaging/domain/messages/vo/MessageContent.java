package com.dkowalczyk.chat_app.messaging.domain.messages.vo;


public record MessageContent(String text, MessageType type, MessageMediaContent media) {
}
