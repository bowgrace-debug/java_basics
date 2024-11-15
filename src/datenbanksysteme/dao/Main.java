package datenbanksysteme.dao;
import java.util.List;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 15.11.2024
 */
public class Main {
    public static void main(String[] args) {
        MovieDao dao = new MariaDbMovieDao();
        List<Movie> movies = dao.readAll();

//        System.out.println(movies);

        Movie movie = new Movie("Fi12 - The Movie", 11.0);
        dao.add(movie);
    }
}
