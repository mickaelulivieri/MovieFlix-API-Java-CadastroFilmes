package com.movieflix.movieflix.repository;

import com.movieflix.movieflix.entity.Category;
import com.movieflix.movieflix.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findMovieByCategories(List<Category> title);

    List<Movie> findTop5ByOrderByRatingDesc();
}
