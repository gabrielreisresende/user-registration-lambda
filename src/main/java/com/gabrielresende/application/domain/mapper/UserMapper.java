package com.gabrielresende.application.domain.mapper;

import com.gabrielresende.application.domain.model.User;
import com.gabrielresende.application.domain.model.dto.request.UserRequest;
import com.gabrielresende.application.domain.model.dto.response.UserResponse;
import jakarta.inject.Singleton;

import java.util.UUID;

@Singleton
public class UserMapper {

    public User toEntity(UserRequest userRequest) {
        return User.builder()
                .userId(UUID.randomUUID().toString())
                .login(userRequest.login())
                .password(userRequest.password())
                .build();
    }

    public UserResponse toResponse(User user) {
        return UserResponse.builder()
                .userId(user.getUserId())
                .login(user.getLogin())
                .build();
    }
}
