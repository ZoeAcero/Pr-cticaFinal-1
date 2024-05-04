import Alimentos.*;
import Experimento.*;
import Archivo.*;
import Poblacion_Bacteria.*;
import javax.swing.*;
import java.util.List;


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

    private static void abrirExperimento(ManejoExperimentos gestor, JFrame frame) {
        try {
            List<String> nombresExperimentos = gestor.getNombresExperimentos();
            JComboBox<String> comboBox = new JComboBox<>(nombresExperimentos.toArray(new String[0]));
            JOptionPane.showMessageDialog(null, comboBox, "Selecciona un experimento", JOptionPane.QUESTION_MESSAGE);
            String nombreExperimentoSeleccionado = (String) comboBox.getSelectedItem();
            gestor.abrirExperimento(nombreExperimentoSeleccionado);
            Experimento experimentoActual = gestor.getExperimentoActual();
            JOptionPane.showMessageDialog(frame, experimentoActual.toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Error al abrir el experimento: " + ex.getMessage());
        }
    }

    private static void crearNuevoExperimento(ManejoExperimentos gestor, JFrame frame) {
        try {
            String nombreExperimento = JOptionPane.showInputDialog("Introduce el nombre del experimento:");
            gestor.crearNuevoExperimento(nombreExperimento);
            String nombrePoblacion = JOptionPane.showInputDialog("Introduce el nombre de la población:");
            Date fechaInicio = new Date();
            Date fechaFin = new Date();
            int numeroBacteriasIniciales = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de bacterias iniciales:"));
            double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura:"));
            String condicionesLuminosidad = JOptionPane.showInputDialog("Introduce las condiciones de luminosidad (Alta, Media, Baja):");
            int dosisComida = Integer.parseInt(JOptionPane.showInputDialog("Introduce la dosis de comida:"));
            PoblacionDeBacterias nuevaPoblacion = new PoblacionDeBacterias(nombrePoblacion, fechaInicio, fechaFin, numeroBacteriasIniciales, temperatura, condicionesLuminosidad, dosisComida);
            gestor.getExperimentoActual().agregarPoblacion(nuevaPoblacion);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Error al crear el experimento: " + ex.getMessage());
        }
    }

    private static void crearNuevaPoblacion(ManejoExperimentos gestor, JFrame frame) {
        try {
            String nombrePoblacion = JOptionPane.showInputDialog("Introduce el nombre de la población:");
            Date fechaInicio = new Date();
            Date fechaFin = new Date();
            int numeroBacteriasIniciales = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de bacterias iniciales:"));
            double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura:"));
            String condicionesLuminosidad = JOptionPane.showInputDialog("Introduce las condiciones de luminosidad (Alta, Media, Baja):");
            int dosisComida = Integer.parseInt(JOptionPane.showInputDialog("Introduce la dosis de comida:"));
            PoblacionDeBacterias nuevaPoblacion = new PoblacionDeBacterias(nombrePoblacion, fechaInicio, fechaFin, numeroBacteriasIniciales, temperatura, condicionesLuminosidad, dosisComida);
            gestor.getExperimentoActual().agregarPoblacion(nuevaPoblacion);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Error al crear la población: " + ex.getMessage());
        }

    }

    private static void visualizarPoblaciones(ManejoExperimentos gestor, JFrame frame) {
        try {
            List<String> nombresPoblaciones = gestor.getNombresPoblaciones();
            JOptionPane.showMessageDialog(frame, nombresPoblaciones);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Error al visualizar las poblaciones: " + ex.getMessage());
        }
    }

    private static void borrarPoblacion(ManejoExperimentos gestor, JFrame frame) {
        try {
            List<String> nombresPoblaciones = gestor.getNombresPoblaciones();
            JComboBox<String> comboBox = new JComboBox<>(nombresPoblaciones.toArray(new String[0]));
            JOptionPane.showMessageDialog(null, comboBox, "Selecciona una población", JOptionPane.QUESTION_MESSAGE);
            String nombrePoblacionSeleccionada = (String) comboBox.getSelectedItem();
            gestor.borrarPoblacion(nombrePoblacionSeleccionada);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Error al borrar la población: " + ex.getMessage());
        }
    }
