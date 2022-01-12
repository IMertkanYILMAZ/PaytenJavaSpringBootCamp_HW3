package dev.imy.paytenjavaspringbootcamp_hw3.controller.response;

import dev.imy.paytenjavaspringbootcamp_hw3.MovieGenre;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MovieCreateResponse {

    private long id;

    public static MovieCreateResponse convertToMovieRespond(Long id) {
        return MovieCreateResponse.builder()
                .id(id)
                .build();
    }
}
