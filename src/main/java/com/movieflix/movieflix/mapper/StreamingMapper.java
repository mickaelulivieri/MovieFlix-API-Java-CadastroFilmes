package com.movieflix.movieflix.mapper;

import com.movieflix.movieflix.entity.Category;
import com.movieflix.movieflix.entity.Streaming;
import com.movieflix.movieflix.request.CategoryRequest;
import com.movieflix.movieflix.request.StreamingRequest;
import com.movieflix.movieflix.response.CategoryResponse;
import com.movieflix.movieflix.response.StreamingResponse;
import lombok.experimental.UtilityClass;

import java.util.stream.Stream;

@UtilityClass
public class StreamingMapper {


    public static Streaming toStreaming(StreamingRequest request){
        return Streaming
                .builder()
                .name(request.name())
                .build();
    }

    public static StreamingResponse toStreamingResponse(Streaming streaming){
        return StreamingResponse
                .builder()
                .id(streaming.getId())
                .name(streaming.getName())
                .build();
    }
}
