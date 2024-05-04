package Archivo;

import Experimento.Experimento;
import javax.swing.*;
import java.awt.*;

public class GestionArchivos extends JFrame{
    private JTextField rutaArchivoField;
    private JTextArea experimentoArea;
    private GestionArchivos gestor;

    public GestionArchivos() {
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Ruta del Archivo:"));
        rutaArchivoField = new JTextField();
        add(rutaArchivoField);

        add(new JLabel("Experimento:"));
        experimentoArea = new JTextArea();
        experimentoArea.setEditable(false);
        add(new JScrollPane(experimentoArea));

        JButton abrirButton = new JButton("Abrir");
        abrirButton.addActionListener(e -> {
            String rutaArchivo = rutaArchivoField.getText();
            gestor = new GestionArchivos();
            Experimento experimento = gestor.abrirArchivo(rutaArchivo);
            experimentoArea.setText(experimento.toString());
        });
        add(abrirButton);

        JButton guardarButton = new JButton("Guardar");
        guardarButton.addActionListener(e -> {
            String rutaArchivo = rutaArchivoField.getText();
            // You need to create an Experimento object here. Replace this with your actual Experimento object.
            Experimento experimento = new Experimento();
            gestor.guardarArchivo(rutaArchivo, experimento);
            JOptionPane.showMessageDialog(null, "Experimento guardado en: " + rutaArchivo);
        });
        add(guardarButton);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GestorDeArchivosGUI().setVisible(true));
    }
}
