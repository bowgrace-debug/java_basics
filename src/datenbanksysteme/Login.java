package datenbanksysteme;

import java.sql.*;
import java.util.Scanner;

/**
 * main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 14.11.2024
 */
public class Login {
    public static void main(String[] args) {
        String name;
        String kennwort;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Kennwort: ");
        kennwort = scanner.nextLine();

//        System.out.println(name);
//        System.out.println(kennwort);

        try(Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db_movie", "root", "")){
            Statement statement = con.createStatement();
            String sql = "SELECT * FROM benutzer WHERE `name`='"+ name +"' AND kennwort = '" + kennwort + "';";
//            System.out.println(sql);
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                System.out.println("Willkommen " + name + "!");
            }
            else {
                System.out.println("Unbekannter Benutzer!");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }


    }
}

