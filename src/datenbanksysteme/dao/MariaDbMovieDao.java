package datenbanksysteme.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * MariaDbMovieDao
 * <p>
 * 1. try-with-resource
 * 2. Verbindung zur Datenbank (DriverManager, connection)
 * 3. Statement / PreparedStatement
 * 4. SQL String
 * 5. SQL Anweisung über das Statement ausführen (executeQuery, executeUpdate, execute)
 * 6.   - wenn executeQuery: ResultSet "verarbeiten"
 *      - executeUpdate, execute: ggf. Response auswerten
 *
 * @author Maximilian Stolle
 * @version 15.11.2024
 */
public class MariaDbMovieDao implements MovieDao{

    private Connection connection;

    public MariaDbMovieDao() {
        connection = DBConnection.getInstance();
    }
    /*
        Lese alle Filme
        @return Liste mit allen Filmen sortiert nach Titel
    */
    @Override
    public List<Movie> readAll() {
        List<Movie> movies = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db_movie", "root", "")){ // Connection = Connection String
            Statement statement = con.createStatement();
            String sql = "SELECT title, year, score, votes, director FROM movie ORDER BY title"; // Befehl für die Datenbank, was ich aus der Datenbank haben möchte
            ResultSet resultSet = statement.executeQuery(sql); // Übergibt den SQL Befehl der Datenbank
            while (resultSet.next()) {
                String title = resultSet.getString("title");
                double score = resultSet.getDouble("score");
                Movie movie = new Movie(title, score);
                movies.add(movie);
            }
        }
        catch (SQLException e){
            e.printStackTrace(); // sorgt dafür, dass die Verbindung aufgebaut werden kann ohne eine Fehlermeldung
        }


        return movies;
    }

    @Override
    public void add(Movie movie) {

    }
}

