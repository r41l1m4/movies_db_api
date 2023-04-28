package dev.ironia.movies_db_api.controller;

import dev.ironia.movies_db_api.model.Movie;
import dev.ironia.movies_db_api.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
@AllArgsConstructor
public class MovieController {

    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return ResponseEntity.ok(
                movieService.getAll()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getOneMovie(@PathVariable String id) {
        return ResponseEntity.ok(
                movieService.getOne(id)
        );

    }
}
