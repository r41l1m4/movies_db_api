package dev.ironia.movies_db_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MoviesDbApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoviesDbApiApplication.class, args);
    }

}
