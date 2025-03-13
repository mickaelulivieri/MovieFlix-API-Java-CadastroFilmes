package com.movieflix.movieflix.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;

@Builder
public record CategoryRequest(@NotEmpty(message = "nome da categoria é obrigatório") String name) {
}
