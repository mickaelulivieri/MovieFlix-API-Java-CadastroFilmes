package com.movieflix.movieflix.service;

import com.movieflix.movieflix.entity.Streaming;
import com.movieflix.movieflix.repository.StreamingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StreamingService {

    private final StreamingRepository streamingRepository;

    // Buscar todos os Streamings
    public List<Streaming> findAll() {
        return streamingRepository.findAll();
    }

    // Salvar um novo Streaming
    public Streaming saveStreaming(Streaming saveStreaming) {
        return streamingRepository.save(saveStreaming);
    }

    // Buscar Streaming por ID com Optional para evitar NullPointerException
    public Optional<Streaming> findById(Long id) {
        return streamingRepository.findById(id);
    }

    // Deletar Streaming por ID
    public void deleteStreaming(Long id) {
        streamingRepository.deleteById(id);
    }
}