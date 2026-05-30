package za.ac.cput.movierentalsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.movierentalsystem.domain.Movie;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, String> {

    Movie findByMovieId(String movieId);
    List<Movie> findByGentre(String gentre);


}
