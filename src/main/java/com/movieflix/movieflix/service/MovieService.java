package com.movieflix.movieflix.service;

import com.movieflix.movieflix.entity.Movie;
import com.movieflix.movieflix.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public Movie save(Movie movie){
        return movieRepository.save(movie);
    }
}
