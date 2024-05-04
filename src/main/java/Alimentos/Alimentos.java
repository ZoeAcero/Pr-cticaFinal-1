package Alimentos;

import javax.swing.*;
import java.awt.*;

public class Alimentos extends JFrame{
    private JTextField nombreField;
    private JTextField cantidadNutrientesField;
    private Alimentos alimentos;

    public Alimentos() {
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        add(nombreField);

        add(new JLabel("Cantidad de Nutrientes:"));
        cantidadNutrientesField = new JTextField();
        add(cantidadNutrientesField);

        JButton button = new JButton("Guardar");
        button.addActionListener(e -> {
            String nombre = nombreField.getText();
            double cantidadNutrientes = Double.parseDouble(cantidadNutrientesField.getText());
            alimentos = new Alimentos(nombre, cantidadNutrientes);
            JOptionPane.showMessageDialog(null, "Alimento guardado: " + alimento.getNombre());
        });
        }
}
