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
}
