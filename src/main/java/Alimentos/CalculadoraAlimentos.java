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

        JButton button = new JButton("Calcular");
        button.addActionListener(e -> {
            int numeroBacteriasIniciales = Integer.parseInt(numeroBacteriasInicialesField.getText());
            PoblacionBacteria poblacion = new PoblacionBacteria(numeroBacteriasIniciales);
            calculador = new CalculadoraAlimentos();
            double resultado = calculador.calcularAlimento(poblacion);
            resultadoField.setText(String.valueOf(resultado));
        });
        add(button);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculadoraAlimentos().setVisible(true));
    }
}
