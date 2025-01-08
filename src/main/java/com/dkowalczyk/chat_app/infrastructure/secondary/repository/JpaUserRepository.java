package com.dkowalczyk.chat_app.infrastructure.secondary.repository;

import com.dkowalczyk.chat_app.messaging.domain.user.aggreagate.User;
import org.springframework.data.jpa.repository.JpaRepository;

public class JpaUserRepository extends JpaRepository<User, Long> {
}
