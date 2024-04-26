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

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, bacteria.getName());
            stmt.setString(2, bacteria.getStartDate());
            stmt.setString(3, bacteria.getEndDate());
            stmt.setInt(4, bacteria.getInitialBacteriaCount());
            stmt.setInt(5, bacteria.getTemperature());
            stmt.setString(6, bacteria.getLuminosity());
            stmt.setInt(7, bacteria.getInitialFood());
            stmt.setInt(8, bacteria.getFoodIncreaseDay());
            stmt.setInt(9, bacteria.getFoodIncreaseAmount());
            stmt.setInt(10, bacteria.getFinalFood());

            stmt.executeUpdate();
        }
    }

    }
