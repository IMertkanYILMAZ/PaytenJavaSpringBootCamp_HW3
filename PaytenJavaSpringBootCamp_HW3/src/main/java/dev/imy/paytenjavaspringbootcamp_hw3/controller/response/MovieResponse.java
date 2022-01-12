package dev.imy.paytenjavaspringbootcamp_hw3.controller.response;

import dev.imy.paytenjavaspringbootcamp_hw3.MovieGenre;
import dev.imy.paytenjavaspringbootcamp_hw3.service.Movie;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class MovieResponse {

    private long id;
    private String name;
    private MovieGenre genre;
    private Integer releaseYear;
    private String director;
    //private List<CastResponse> castList;

    public static String convertToMovieIdRespond(Long id) {
        return "Movie has been created with ID number : " + id;
    }

    public static MovieResponse convertToMovieRespond(Movie movie) {
        return MovieResponse.builder()
                .name(movie.getName())
                .releaseYear(movie.getReleaseYear())
                .director(movie.getDirector())
                .genre(movie.getGenre())
                .build();
    }
}
