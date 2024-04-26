package Poblacion_Bacteria;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;


public class PoblacionBacteria extends JFrame implements Serializable{
    private JTextField nameField;
    private JTextField startDateField;
    private JTextField endDateField;
    private JTextField initialBacteriaCountField;
    private JTextField temperatureField;
    private JTextField luminosityField;
    private JTextField initialFoodField;
    private JTextField foodIncreaseDayField;
    private JTextField foodIncreaseAmountField;
    private JTextField finalFoodField;

    public PoblacionBacteria() {
        setLayout(new GridLayout(11, 2));

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Start Date (yyyy-MM-dd):"));
        startDateField = new JTextField();
        add(startDateField);

        add(new JLabel("End Date (yyyy-MM-dd):"));
        endDateField = new JTextField();
        add(endDateField);

        add(new JLabel("Initial Bacteria Count:"));
        initialBacteriaCountField = new JTextField();
        add(initialBacteriaCountField);

        add(new JLabel("Temperature:"));
        temperatureField = new JTextField();
        add(temperatureField);

        add(new JLabel("Luminosity:"));
        luminosityField = new JTextField();
        add(luminosityField);

        add(new JLabel("Initial Food:"));
        initialFoodField = new JTextField();
        add(initialFoodField);

        add(new JLabel("Food Increase Day:"));
        foodIncreaseDayField = new JTextField();
        add(foodIncreaseDayField);

        add(new JLabel("Food Increase Amount:"));
        foodIncreaseAmountField = new JTextField();
        add(foodIncreaseAmountField);

        add(new JLabel("Final Food:"));
        finalFoodField = new JTextField();
        add(finalFoodField);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> submitForm());
        add(submitButton);

        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void submitForm() {
        try {
            String name = nameField.getText();
            if (name.isEmpty()) {
                throw new Exception("Name is required");
            }

            String startDate = startDateField.getText();
            if (startDate.isEmpty()) {
                throw new Exception("Start Date is required");
            }

            String endDate = endDateField.getText();
            if (endDate.isEmpty()) {
                throw new Exception("End Date is required");
            }

            int initialBacteriaCount = Integer.parseInt(initialBacteriaCountField.getText());
            int temperature = Integer.parseInt(temperatureField.getText());
            String luminosity = luminosityField.getText();
            int initialFood = Integer.parseInt(initialFoodField.getText());
            int foodIncreaseDay = Integer.parseInt(foodIncreaseDayField.getText());
            int foodIncreaseAmount = Integer.parseInt(foodIncreaseAmountField.getText());
            int finalFood = Integer.parseInt(finalFoodField.getText());
            Bacteria bacteria = new Bacteria(name, startDate, endDate, initialBacteriaCount, temperature, luminosity, initialFood, foodIncreaseDay, foodIncreaseAmount, finalFood);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new PoblacionBacteria();
    }
}
