package PROG_Ej_20_Eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author fsancheztemprano
 */
public class Eventos extends JFrame implements ActionListener {

    JPanel panel;
    JButton boton;
    JButton boton2;
    JButton boton3;

    public Eventos() {
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
        boton.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            panel.setBackground(Color.RED);
        } else if (e.getSource() == boton2) {
            panel.setBackground(Color.GREEN);
        } else if (e.getSource() == boton3) {
            panel.setBackground(Color.YELLOW);
        }
    }

}
