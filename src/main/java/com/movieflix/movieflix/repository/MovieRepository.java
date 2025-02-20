package com.movieflix.movieflix.repository;

import com.movieflix.movieflix.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
