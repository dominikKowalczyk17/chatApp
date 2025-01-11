package com.dkowalczyk.chat_app.infrastructure.primary;

import com.dkowalczyk.chat_app.infrastructure.primary.RestAuthorityBuilder;
import com.dkowalczyk.chat_app.messaging.domain.user.aggreagate.Authority;
import org.jilt.Builder;

import java.util.Set;
import java.util.stream.Collectors;

@Builder
public record RestAuthority(String name) {
    public static Set<RestAuthority> fromSet(Set<Authority> authorities) {
        return authorities.stream()
                .map(authority -> RestAuthorityBuilder.restAuthority().name(authority.getName().name()).build())
                .collect(Collectors.toSet());
    }
}
