package com.movieflix.movieflix.response;

import lombok.Builder;

@Builder
public record CategoryResponse(Long id, String name) {
}
