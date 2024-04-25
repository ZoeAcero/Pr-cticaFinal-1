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

    public BacteriaPopulation() {
        setLayout(new GridLayout(11, 2));

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);
}
