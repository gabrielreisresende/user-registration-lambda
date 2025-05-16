package com.gabrielresende.application.domain.service;

import com.gabrielresende.application.domain.mapper.UserMapper;
import com.gabrielresende.application.domain.model.User;
import com.gabrielresende.application.domain.model.dto.request.UserRequest;
import com.gabrielresende.application.domain.model.dto.response.UserResponse;
import com.gabrielresende.application.port.in.CreateUserUseCase;
import com.gabrielresende.application.port.out.PersistUserPort;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

@Singleton
@RequiredArgsConstructor
public class UserService implements CreateUserUseCase {

    private final PersistUserPort persistUserPort;
    private final UserMapper userMapper;

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        User user = userMapper.toEntity(userRequest);
        persistUserPort.save(user);
        return userMapper.toResponse(user);
    }
}
