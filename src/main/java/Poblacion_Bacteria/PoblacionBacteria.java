package Poblacion_Bacteria;

import javax.swing.*;
import java.awt.*;


public class PoblacionBacteria extends JFrame{
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
}
