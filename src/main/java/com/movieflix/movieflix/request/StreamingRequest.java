package com.movieflix.movieflix.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;

@Builder
public record StreamingRequest(@NotEmpty(message = "Nome do streaming é obrigatório") String name) {
}
