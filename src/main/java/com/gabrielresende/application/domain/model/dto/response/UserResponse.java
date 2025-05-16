package com.gabrielresende.application.domain.model.dto.response;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Builder;

@Builder
@Introspected
    @Serdeable.Serializable
@Serdeable.Deserializable
public record UserResponse(String userId,
                           String login) {
}
