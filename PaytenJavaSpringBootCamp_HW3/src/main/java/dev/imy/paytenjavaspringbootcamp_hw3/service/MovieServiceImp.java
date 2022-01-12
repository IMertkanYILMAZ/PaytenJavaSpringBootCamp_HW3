package dev.imy.paytenjavaspringbootcamp_hw3.service;

import dev.imy.paytenjavaspringbootcamp_hw3.controller.request.MovieRequest;
import dev.imy.paytenjavaspringbootcamp_hw3.repository.MovieDao;
import dev.imy.paytenjavaspringbootcamp_hw3.repository.MovieEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieServiceImp implements MovieService{

    private final MovieDao movieDao;

    @Override
    public Long create(Movie movie) {
        MovieEntity movieEntity = movie.convertToMovieEntity(movie);
        return movieDao.save(movieEntity);
    }

    @Override
    public Movie retrieve(Long id) {
        MovieEntity foundMovieEntity = movieDao.retrieve(id);
        return Movie.convertFromMovieEntity(foundMovieEntity);
    }

    @Override
    public void delete(Long id) {
        movieDao.deleteMovie(id);
    }
}
