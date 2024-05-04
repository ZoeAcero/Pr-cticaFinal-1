import Alimentos.*;
import Experimento.*;
import Archivo.*;
import Poblacion_Bacteria.*;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        ManejoExperimentos gestor = new ManejoExperimentos();

        JFrame frame = new JFrame("Gestor de Experimentos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);


        JPanel panel = new JPanel();
        frame.add(panel);

        JButton abrirButton = new JButton("Abrir un archivo que contenga un experimento");
        abrirButton.addActionListener(e -> abrirExperimento(gestor, frame));
        panel.add(abrirButton);

        JButton crearExperimentoButton = new JButton("Crear un nuevo experimento");
        crearExperimentoButton.addActionListener(e -> crearNuevoExperimento(gestor, frame));
        panel.add(crearExperimentoButton);

        JButton crearPoblacionButton = new JButton("Crear una población de bacterias y añadirla al experimento actual");
        crearPoblacionButton.addActionListener(e -> crearNuevaPoblacion(gestor, frame));
        panel.add(crearPoblacionButton);

    }
