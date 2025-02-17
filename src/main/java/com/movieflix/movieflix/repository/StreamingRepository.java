package com.movieflix.movieflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamingRepository extends JpaRepository<com.movieflix.movieflix.entity.Streaming, Long> {
}
