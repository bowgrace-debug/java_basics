package datenbanksysteme.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DBConnection
 * <p>
 *
 * @author Maximilian Stolle
 * @version 15.11.2024
 */
public class DBConnection {
    private static final String CONNECTION_STRING = "jdbc:mariadb://localhost:3306/db_movie";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection connection;

    private DBConnection() {

    }

    public static Connection getInstance() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(CONNECTION_STRING, USER, PASSWORD);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }

    public static void close() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
