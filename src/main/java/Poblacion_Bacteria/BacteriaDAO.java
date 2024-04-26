package Poblacion_Bacteria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BacteriaDAO {
    private final String url = "jdbc:mysql://localhost:3306/mydatabase";
    private final String user = "username";
    private final String password = "password";

    public void saveBacteria(Bacteria bacteria) throws SQLException {
        String sql = "INSERT INTO bacteria (name, start_date, end_date, initial_bacteria_count, temperature, luminosity, initial_food, food_increase_day, food_increase_amount, final_food) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    }
