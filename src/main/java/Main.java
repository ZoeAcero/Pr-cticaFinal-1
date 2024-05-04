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

    }
