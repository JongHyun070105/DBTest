package com.example.moviechart.controller;

import com.example.moviechart.model.Movie;
import com.example.moviechart.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Movie> movies = movieService.getAllMovies();
        model.addAttribute("movies", movies);
        return "index";
    }

    @GetMapping("/movie/{id}")
    public String details(@PathVariable Long id, Model model) {
        Movie movie = movieService.getMovieById(id);
        System.out.println(movie.getTitle());
        model.addAttribute("movie", movie);
        return "details";
    }
}
