package dev.imy.paytenjavaspringbootcamp_hw3.service;

import dev.imy.paytenjavaspringbootcamp_hw3.MovieGenre;
import dev.imy.paytenjavaspringbootcamp_hw3.repository.MovieEntity;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Builder
@EqualsAndHashCode
public class Movie {

    private String name;
    private MovieGenre genre;
    private Integer releaseYear;
    private String director;

    public static Movie convertFromMovieEntity(MovieEntity foundMovieEntity) {
        return Movie.builder()
                .name(foundMovieEntity.getName())
                .releaseYear(foundMovieEntity.getReleaseYear())
                .director(foundMovieEntity.getDirector())
                .genre(foundMovieEntity.getGenre())
                .build();
    }


    public MovieEntity convertToMovieEntity(Movie movie) {

        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setName(movie.getName());
        movieEntity.setDirector(movie.getDirector());
        movieEntity.setGenre(movie.getGenre());
        movieEntity.setReleaseYear(movie.getReleaseYear());
        return movieEntity;
    }
}
