package com.gabrielresende.application.domain.handler;

import com.gabrielresende.application.domain.model.dto.request.UserRequest;
import com.gabrielresende.application.domain.model.dto.response.UserResponse;
import com.gabrielresende.application.domain.service.UserService;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.function.aws.MicronautRequestHandler;
import jakarta.inject.Inject;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Introspected
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserHandler extends MicronautRequestHandler<UserRequest, UserResponse> {

    private static final String CLASS = CreateUserHandler.class.getSimpleName();

    @Inject
    private UserService userService;

    @Override
    public UserResponse execute(UserRequest userRequest) {
        return userService.createUser(userRequest);
    }
}
