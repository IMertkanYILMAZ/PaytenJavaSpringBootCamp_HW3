package dev.imy.paytenjavaspringbootcamp_hw3.controller;

import dev.imy.paytenjavaspringbootcamp_hw3.controller.request.MovieRequest;
import dev.imy.paytenjavaspringbootcamp_hw3.controller.response.MovieCreateResponse;
import dev.imy.paytenjavaspringbootcamp_hw3.controller.response.MovieResponse;
import dev.imy.paytenjavaspringbootcamp_hw3.service.Movie;
import dev.imy.paytenjavaspringbootcamp_hw3.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

@RestController
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @PostMapping("/movies")
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestBody @Valid MovieRequest request){
        Movie movie = request.convertToMovie();
        Long id = movieService.create(movie);
        return MovieResponse.convertToMovieIdRespond(id);
    }

    @GetMapping("/movies/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MovieResponse retrieve(@PathVariable Long id){
        Movie movie = movieService.retrieve(id);
        return MovieResponse.convertToMovieRespond(movie);
    }

    @DeleteMapping("movies/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String delete(@PathVariable Long id){
        movieService.delete(id);
        return "Movie with the ID number :" +id+ "has been deleted...";
    }

}
