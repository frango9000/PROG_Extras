package PROG_Ej_20_Eventos;

import PROG_Ej_20_Eventos.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author fsancheztemprano
 */
public class EventosAnon extends JFrame {

    JPanel panel;
    JButton boton;

    public EventosAnon() {
        super("*** EVENTOS ***");
    }

    public void crearVentana() {
        panel = new JPanel();
        boton = new JButton("vermello");
        setSize(400, 200);
        panel.add(boton);
        add(panel);

        setVisible(true);
        setDefaultCloseOperation(3);
        //Selecionando eventos 
        boton.addActionListener(new ActionListener() {

            boolean red = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!red) {
                    panel.setBackground(Color.RED);
                    red = true;
                } else {
                    panel.setBackground(Color.WHITE);
                    red = false;
                }
            }
        });
    }

}
