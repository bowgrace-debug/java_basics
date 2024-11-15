package datenbanksysteme.dao;
import java.util.List;

/**
 * MovieDao
 * <p>
 *
 * @author Maximilian Stolle
 * @version 15.11.2024
 */
public interface MovieDao {
    List<Movie> readAll();
    void add(Movie movie);
}