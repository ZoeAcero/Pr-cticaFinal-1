package Experimento;

import Poblacion_Bacteria.PoblacionBacteria;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Experimento implements Serializable{
    private List<PoblacionBacteria> populations;

    public Experimento() {
        populations = new ArrayList<>();
    }

    public void addPopulation(PoblacionBacteria poblacion) {
        populations.add(poblacion);
    }

    public void removePopulation(PoblacionBacteria poblacion) {
        populations.remove(poblacion);
    }

    public PoblacionBacteria getPopulation(String name) {
        for (PoblacionBacteria population : populations) {
            if (population.getName().equals(name)) {
                return population;
            }
        }
        return null;
    }

    public String getPopulationInfo() {
        return null;
    }
}
