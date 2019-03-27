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
    JButton boton2;
    JButton boton3;

    public EventosAnon() {
        super("*** EVENTOS ***");
    }

    public void crearVentana() {
        panel = new JPanel();
        boton = new JButton("Rojo");
        boton2 = new JButton("Azul");
        boton3 = new JButton("Verde");
        setSize(400, 200);
        panel.add(boton);
        panel.add(boton2);
        panel.add(boton3);
        add(panel);

        setVisible(true);
        setDefaultCloseOperation(3);
        //Selecionando eventos 
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);

            }
        });
        boton2.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE);

            }
        });
        boton3.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN);

            }
        });
        
    }

}
