package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcconnection {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // JDBC URL, username, and password
        String dbURL = "jdbc:mysql://localhost:3306/StudentRepo";
        String username = "root";
        String password = "Anss@2203";

        // Load MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        Connection con = DriverManager.getConnection(dbURL, username, password);

        // Create statement
        java.sql.Statement st = con.createStatement();

        // Execute query
        String selectQuery = "SELECT * FROM Students;";
        ResultSet rs = st.executeQuery(selectQuery);

        // Process results
        while (rs.next()) {
            System.out.println("Student ID: " + rs.getInt("ID"));
            System.out.println("First Name: " + rs.getString("Name"));
            System.out.println("-----------------------------");
        }

        // Close resources
        rs.close();
        st.close();
        con.close();
    }
}