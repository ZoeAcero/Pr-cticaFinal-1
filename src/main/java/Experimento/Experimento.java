package Experimento;

import Poblacion_Bacteria.PoblacionBacteria;

import java.util.ArrayList;
import java.util.List;

public class Experimento {
    private List<PoblacionBacteria> populations;

    public Experimento() {
        populations = new ArrayList<>();
    }

    public void addPopulation(PoblacionBacteria poblacion) {
        populations.add(poblacion);
    }
}
