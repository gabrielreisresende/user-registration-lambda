package com.gabrielresende.application.domain.model;

import io.micronaut.core.annotation.Introspected;
import lombok.Builder;
import lombok.Data;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@Introspected
public class User {

    private String userId;

    private String login;

    private String password;

    public Map<String, AttributeValue> toAttributeMap() {
        Map<String, AttributeValue> item = new HashMap<>();
        item.put("userId", AttributeValue.builder().s(this.userId).build());
        item.put("login", AttributeValue.builder().s(this.login).build());
        item.put("password", AttributeValue.builder().s(this.password).build());
        return item;
    }
}
