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

        JButton visualizarPoblacionesButton = new JButton("Visualizar los nombres de todas las poblaciones de bacterias del experimento actual");
        visualizarPoblacionesButton.addActionListener(e -> visualizarPoblaciones(gestor, frame));
        panel.add(visualizarPoblacionesButton);

        JButton borrarPoblacionButton = new JButton("Borrar una población de bacterias del experimento actual");
        borrarPoblacionButton.addActionListener(e -> borrarPoblacion(gestor, frame));
        panel.add(borrarPoblacionButton);

        JButton verInformacionButton = new JButton("Ver información detallada de una población de bacterias del experimento actual");
        verInformacionButton.addActionListener(e -> verInformacionPoblacion(gestor, frame));
        panel.add(verInformacionButton);

        JButton guardarButton = new JButton("Guardar");
        guardarButton.addActionListener(e -> guardarExperimento(gestor, frame));
        panel.add(guardarButton);

        JButton guardarComoButton = new JButton("Guardar como");
        guardarComoButton.addActionListener(e -> guardarExperimentoComo(gestor, frame));
        panel.add(guardarComoButton);

        frame.setVisible(true);
    }

}


