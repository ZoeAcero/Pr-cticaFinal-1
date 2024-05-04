package Alimentos;

import javax.swing.*;
import java.awt.*;
import Poblacion_Bacteria.PoblacionBacteria;

public class CalculadoraAlimentos extends JFrame {
    private JTextField numeroBacteriasInicialesField;
    private JTextField resultadoField;
    private CalculadoraAlimentos calculador;

    public CalculadoraAlimentos() {
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Número de Bacterias Iniciales:"));
        numeroBacteriasInicialesField = new JTextField();
        add(numeroBacteriasInicialesField);

        add(new JLabel("Resultado:"));
        resultadoField = new JTextField();
        resultadoField.setEditable(false);
        add(resultadoField);
}
