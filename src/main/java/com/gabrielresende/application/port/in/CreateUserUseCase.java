package com.gabrielresende.application.port.in;

import com.gabrielresende.application.domain.model.dto.request.UserRequest;
import com.gabrielresende.application.domain.model.dto.response.UserResponse;

public interface CreateUserUseCase {

    UserResponse createUser(UserRequest userRequest);
}
