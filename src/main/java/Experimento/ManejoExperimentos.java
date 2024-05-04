package Experimento;

import java.util.*;
import java.io.*;

import Poblacion_Bacteria.PoblacionBacteria;

import javax.swing.*;

public class ManejoExperimentos {
    private Map<String, Experimento> experimentos;

    public ManejoExperimentos() {
        experimentos = new HashMap<>();
    }

    private static void abrirExperimento(ManejoExperimentos gestor, JFrame frame) {
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

    private Experimento createNewExperiment(String filename) {
        return null;
    }

    private static void crearNuevaPoblacion(ManejoExperimentos gestor, JFrame frame) {
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
        String info = gestor.getExperimentoActual().getPopulationInfo();
        JOptionPane.showMessageDialog(frame, info);
    }

    private static void guardarExperimento(ManejoExperimentos gestor, JFrame frame) {
        String filename = JOptionPane.showInputDialog(frame, "Enter the filename to save the current experiment:");
        gestor.saveExperiment(gestor.getExperimentoActual(), filename);
    }

    private static void guardarExperimentoComo(ManejoExperimentos gestor, JFrame frame) {
        String filename = JOptionPane.showInputDialog(frame, "Enter the new filename to save the current experiment:");
        gestor.saveExperiment(gestor.getExperimentoActual(), filename);
    }

    public static void main(String[] args) {
        ManejoExperimentos manager = new ManejoExperimentos();
        Experimento experiment = manager.createNewExperiment("experimento1");
        int numeroBacteriasIniciales = 0;
        PoblacionBacteria poblacion = new PoblacionBacteria(numeroBacteriasIniciales);
        experiment.addPopulation(poblacion);
        manager.saveExperiment(experiment, "experimento1");

        List<String> allExperiments = manager.getAllExperiments();
        for (String experimento : allExperiments) {
            System.out.println(experimento);
        }
    }

    private List<String> getAllExperiments() {
        return null;
    }

    private void saveExperiment(Experimento experimento, String filename) {
    }

    public List<String> getNombresExperimentos() {
        return null;
    }

    public Experimento getExperimentoActual() {
        return null;
    }

    public void abrirExperimento(String nombreExperimentoSeleccionado) {
    }
}