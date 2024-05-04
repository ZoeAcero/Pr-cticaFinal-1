package Experimento;

import java.util.*;
import java.io.*;
import java.util.*;
import Poblacion_Bacteria.PoblacionBacteria;

public class ManejoExperimentos {
    private Map<String, Experimento> experimentos;

    public ManejoExperimentos() {
        experimentos = new HashMap<>();
    }

    public Experimento openExperiment(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Experimento experiment = (Experimento) ois.readObject();
            experimentos.put(filename, experiment);
            return experiment;
        }
    }

    public void saveExperiment(Experimento experiment, String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(experiment);
            experimentos.put(filename, experiment); // Corrección aquí
        }
    }

    public Experimento createNewExperiment(String filename) {
        Experimento experiment = new Experimento();
        experimentos.put(filename, experiment);
        return experiment;
    }

    public List<String> getAllExperiments() {
        return new ArrayList<>(experimentos.keySet());
    }

    public void deleteExperiment(String filename) {
        experimentos.remove(filename);
        File file = new File(filename);
        if (file.exists()) {
            file.delete();
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
}