package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static String DB_URL="jdbc:postgresql://localhost:5432/jdbc";
    private static String USERNAME="postgres";
    private static String PASSWORD="postgres";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
