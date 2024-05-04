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
                // Here you can add code to create and add a new PoblacionDeBacterias instance
                // For example:
                PoblacionBacteria poblacion = new PoblacionBacteria();
                gestor.agregarPoblacion(poblacion);
                listModel.addElement(poblacion);
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GestionPoblaciones().setVisible(true);
            }
        });
    }

    }
