package dev.imy.paytenjavaspringbootcamp_hw3.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieDaoImp implements MovieDao{

    private final MovieJpaRepository movieJpaRepository;

    @Override
    public Long save(MovieEntity movieEntity) {
        movieJpaRepository.save(movieEntity);
        return movieEntity.getId();
    }

    @Override
    public MovieEntity retrieve(Long id) {
        Optional<MovieEntity> foundMovieEntity = movieJpaRepository.findById(id);

        if (foundMovieEntity.isPresent()){
            return foundMovieEntity.get();
        }
        else throw new RuntimeException();
    }

    @Override
    public void deleteMovie(Long id) {
        Optional<MovieEntity> foundMovieEntity = movieJpaRepository.findById(id);
        if (foundMovieEntity.isPresent()){
            movieJpaRepository.delete(foundMovieEntity.get());
        }
        else throw new RuntimeException();
    }
}
