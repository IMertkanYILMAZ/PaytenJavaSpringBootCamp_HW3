package dev.imy.paytenjavaspringbootcamp_hw3.service;

import dev.imy.paytenjavaspringbootcamp_hw3.controller.request.MovieRequest;

public interface MovieService {

    Long create(Movie movie);

    Movie retrieve(Long id);

    void delete(Long id);
}
