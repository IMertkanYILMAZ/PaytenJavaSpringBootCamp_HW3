package dev.imy.paytenjavaspringbootcamp_hw3.controller.request;

import dev.imy.paytenjavaspringbootcamp_hw3.MovieGenre;
import dev.imy.paytenjavaspringbootcamp_hw3.service.Movie;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class MovieRequest {

    @NotBlank
    private String name;

    @NotNull
    private MovieGenre genre;

    @NotNull
    private Integer releaseYear;

    @NotNull
    private String director;

    public Movie convertToMovie() {
        return Movie.builder()
                .name(name)
                .genre(genre)
                .releaseYear(releaseYear)
                .director(director)
                .build();
    }

}
