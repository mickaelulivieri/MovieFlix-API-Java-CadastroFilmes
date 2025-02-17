package com.movieflix.movieflix.response;

import lombok.Builder;

@Builder
public record StreamingResponse(long id, String name) {
}
