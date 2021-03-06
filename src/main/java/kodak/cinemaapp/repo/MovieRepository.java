package kodak.cinemaapp.repo;

import kodak.cinemaapp.dtos.MovieDTO;
import kodak.cinemaapp.entities.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Integer> {

    List<Movie> findMovieById(int movieId);
    List<Movie> findMovieByAgeGroup(String ageGroup);
    List<Movie> findMovieByActor(String Actor);
    List<Movie> findMovieByRating(String rating);
    Movie save(Movie movie);

}
