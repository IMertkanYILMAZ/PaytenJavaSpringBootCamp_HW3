package dev.imy.paytenjavaspringbootcamp_hw3.repository;


public interface MovieDao {
    Long save(MovieEntity movieEntity);

    MovieEntity retrieve(Long id);

    void deleteMovie(Long id);
}
