package datenbanksysteme.or_mapper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 14.11.2024
 */
public class Main {
    public static void main(String[] args) {
        String server = "localhost"; // 127.0.0.1
        String port = "3306";
        String user = "root";
        String password = "";
        String database = "db_movie";
        String url = "jdbc:mariadb://" + server + ":" + port + "/" + database; // = Connection String
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            String sql;
            Statement statement = con.createStatement();

            // Read (SELECT) Abfrage, Query
            sql = "SELECT title,score FROM movie WHERE year=1999";
            ResultSet resultSet = statement.executeQuery(sql);

            /*
                OR-Mapper
            */
            // Liste erstellen
            List<Movie> movies = new ArrayList<>();
            // alle Einträge des Abfrageergebnisses durchgehen
            while (resultSet.next()) {  // gehe, wenn möglich, zum nächsten Datensatz
                String title =  resultSet.getString("title");   // hole den Inhalt des Feldes 'title'
                double score = resultSet.getDouble("score");    // hole den Inhalt des Feldes 'score'
                Movie movie = new Movie(title, score);  // Movie Objekt erstellen und füllen
                movies.add(movie);  // Movie Objekt zur Liste
            }

            // Ausgabe der kompletten Liste über toString
            System.out.println(movies);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
