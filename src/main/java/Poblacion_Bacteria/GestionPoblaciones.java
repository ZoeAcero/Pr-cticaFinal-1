package Poblacion_Bacteria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionPoblaciones  extends JFrame{
    private GestionPoblaciones gestor;
    private DefaultListModel<PoblacionBacteria> listModel;
    private JList<PoblacionBacteria> list;

    public GestionPoblaciones() {
        gestor = new GestionPoblaciones();
        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PoblacionBacteria poblacion = new PoblacionBacteria(numeroBacteriasIniciales);
                gestor.agregarPoblacion(poblacion);
                listModel.addElement(poblacion);
            }
        });

        JButton removeButton = new JButton("Remove");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PoblacionBacteria selectedPoblacion = list.getSelectedValue();
                if (selectedPoblacion != null) {
                    gestor.eliminarPoblacion(selectedPoblacion);
                    listModel.removeElement(selectedPoblacion);
                }
            }
        });

        setLayout(new BorderLayout());
        add(new JScrollPane(list), BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        add(buttonPanel, BorderLayout.SOUTH);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void agregarPoblacion(PoblacionBacteria poblacion) {
        listModel.addElement(poblacion);
    }

    private void eliminarPoblacion(PoblacionBacteria poblacion) {
        listModel.removeElement(poblacion);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GestionPoblaciones().setVisible(true);
            }
        });
    }

}
