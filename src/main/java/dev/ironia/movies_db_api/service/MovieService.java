package dev.ironia.movies_db_api.service;

import dev.ironia.movies_db_api.model.Movie;
import dev.ironia.movies_db_api.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MovieService {

    private MovieRepository movieRepository;

    public List<Movie> getAll() {
        return movieRepository.findAll();
    }
}
