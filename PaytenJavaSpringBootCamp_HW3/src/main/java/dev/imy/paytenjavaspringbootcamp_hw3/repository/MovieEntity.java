package dev.imy.paytenjavaspringbootcamp_hw3.repository;

import dev.imy.paytenjavaspringbootcamp_hw3.MovieGenre;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private MovieGenre genre;

    private Integer releaseYear;

    @Column(nullable = false)
    private String director;

}
