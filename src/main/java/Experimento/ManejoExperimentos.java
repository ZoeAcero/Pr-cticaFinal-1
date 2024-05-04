package Experimento;

import java.util.*;
import java.io.*;
import java.util.*;
import Poblacion_Bacteria.PoblacionBacteria;
import Experimento.Experimento;

import javax.swing.*;

public class ManejoExperimentos {
    private Map<String, Experimento> experimentos;

    public ManejoExperimentos() {
        experimentos = new HashMap<>();
    }

    private static void abrirExperimento(ManejoExperimentos gestor, JFrame frame) {
        // Use a file chooser or similar to select the file
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            gestor.abrirExperimento(selectedFile.getPath());
        }
    }

    private static void crearNuevoExperimento(ManejoExperimentos gestor, JFrame frame) {
        String filename = JOptionPane.showInputDialog(frame, "Enter the filename for the new experiment:");
        gestor.createNewExperiment(filename);
    }

    private void createNewExperiment(String filename) {
    }

    private static void crearNuevaPoblacion(ManejoExperimentos gestor, JFrame frame) {
        // You'll need to gather the necessary data to create a new PoblacionBacteria
        // This is just a placeholder
        PoblacionBacteria poblacion = new PoblacionBacteria();
        gestor.getExperimentoActual().addPopulation(poblacion);
    }

    private static void visualizarPoblaciones(ManejoExperimentos gestor, JFrame frame) {
        List<String> allExperiments = gestor.getAllExperiments();
        for (String experiment : allExperiments) {
            System.out.println(experiment);
        }
    }

    private static void borrarPoblacion(ManejoExperimentos gestor, JFrame frame) {
        String filename = JOptionPane.showInputDialog(frame, "Enter the filename of the experiment to delete:");
        gestor.deleteExperiment(filename);
    }

    private static void verInformacionPoblacion(ManejoExperimentos gestor, JFrame frame) {
        // You'll need to implement a method to get the information of a population
        // This is just a placeholder
        String info = gestor.getExperimentoActual().getPopulationInfo();
        JOptionPane.showMessageDialog(frame, info);
    }

    private static void guardarExperimento(ManejoExperimentos gestor, JFrame frame) {
        String filename = JOptionPane.showInputDialog(frame, "Enter the filename to save the current experiment:");
        try {
            gestor.saveExperiment(gestor.getExperimentoActual(), filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void guardarExperimentoComo(ManejoExperimentos gestor, JFrame frame) {
        // This could be similar to guardarExperimento, but with a different filename
        String filename = JOptionPane.showInputDialog(frame, "Enter the new filename to save the current experiment:");
        try {
            gestor.saveExperiment(gestor.getExperimentoActual(), filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ManejoExperimentos manager = new ManejoExperimentos();
        Experimento experiment = manager.createNewExperiment("experimento1");
        PoblacionBacteria poblacion = new PoblacionBacteria(numeroBacteriasIniciales);
        experiment.addPopulation(poblacion);
        try {
            manager.saveExperiment(experiment, "experimento1");
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> allExperiments = manager.getAllExperiments();
        for (String experimento : allExperiments) {
            System.out.println(experimento); // Imprimir el nombre del experimento
        }
    }

    public List<String> getNombresExperimentos() {
        return null;
    }

    public Experimento.Experimento getExperimentoActual() {
        return null;
    }

    public void abrirExperimento(String nombreExperimentoSeleccionado) {
    }
}