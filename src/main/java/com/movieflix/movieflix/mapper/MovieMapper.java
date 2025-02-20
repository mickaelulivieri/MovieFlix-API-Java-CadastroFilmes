package com.movieflix.movieflix.mapper;

import com.movieflix.movieflix.entity.Category;
import com.movieflix.movieflix.entity.Movie;
import com.movieflix.movieflix.entity.Streaming;
import com.movieflix.movieflix.request.MovieRequest;
import com.movieflix.movieflix.response.CategoryResponse;
import com.movieflix.movieflix.response.MovieResponse;
import com.movieflix.movieflix.response.StreamingResponse;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class MovieMapper {


    public static Movie toMovie(MovieRequest request){

        List<Category> categories = request.categories().stream()
                .map(categoryId -> Category.builder().id(categoryId).build())
                .toList();

        List<Streaming> streamings = request.streamings().stream()
                .map(streamingId -> Streaming.builder().id(streamingId).build())
                .toList();


        return Movie.builder()
                .title(request.title())
                .description(request.description())
                .releaseDate(request.releaseDate())
                .rating(request.rating())
                .categories(categories)
                .streamings(streamings)
                .build();
    }

    public static MovieResponse toMovieResponse(Movie movie){


        List<CategoryResponse> categories = movie.getCategories()
                .stream()
                .map(category -> CategoryMapper.toCategoryResponse(category))
                .toList();

        List<StreamingResponse> streamings = movie.getStreamings()
                .stream()
                .map(streaming -> StreamingMapper.toStreamingResponse(streaming))
                .toList();

        return MovieResponse.builder()
                .id(movie.getId())
                .title(movie.getTitle())
                .description(movie.getDescription())
                .releaseDate(movie.getReleaseDate())
                .rating(movie.getRating())
                .categories(categories)
                .streaming(movie.getStreamings()
                        .stream()
                        .map(streaming-> StreamingMapper.toStreamingResponse(streaming))
                        .toList())
                .build();


    }
}
