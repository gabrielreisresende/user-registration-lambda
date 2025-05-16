package com.gabrielresende.application.domain.model.dto.request;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.NotBlank;

@Introspected
@Serdeable.Deserializable
public record UserRequest(@NotBlank String login,
                          @NotBlank String password) {
}
