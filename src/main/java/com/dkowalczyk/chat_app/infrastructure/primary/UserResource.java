package com.dkowalczyk.chat_app.infrastructure.primary;

import com.dkowalczyk.chat_app.messaging.application.UserApplicationService;
import com.dkowalczyk.chat_app.messaging.domain.user.aggreagate.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    private final UserApplicationService userService;
    private final UserApplicationService userApplicationService;

    public UserResource(UserApplicationService userService, UserApplicationService userApplicationService) {
        this.userService = userService;
        this.userApplicationService = userApplicationService;
    }

    @GetMapping("/get-authenticated-user")
    ResponseEntity<RestUser> getAuthenticatedUser(@AuthenticationPrincipal Jwt user,
                                                  @RequestParam boolean forceResync) {
        User authenticatedUser = userApplicationService.getAuthenticatedUserWithSync(user, forceResync);
        RestUser restUser = RestUser.from(authenticatedUser);

        return ResponseEntity.ok(restUser);
    }
}
