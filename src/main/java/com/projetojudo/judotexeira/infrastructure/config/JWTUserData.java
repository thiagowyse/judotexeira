package com.projetojudo.judotexeira.infrastructure.config;

import lombok.Builder;

@Builder
public record JWTUserData(Long userId, String email) {
}