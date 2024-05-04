package Archivo;

import Experimento.Experimento;
import java.io.*;

public class GestorDeArchivos {
    public Experimento abrirArchivo(String rutaArchivo) {
        Experimento experimento = null;
        try {
            FileInputStream fileIn = new FileInputStream(rutaArchivo);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            experimento = (Experimento) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("La clase Experimento no se encontró");
            c.printStackTrace();
        }
        return experimento;
    }

    public void guardarArchivo(String rutaArchivo, Experimento experimento) {
        try {
            FileOutputStream fileOut = new FileOutputStream(rutaArchivo);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(experimento);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
