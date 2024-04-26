package Experimento;

import java.io.*;
import java.util.*;

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
}