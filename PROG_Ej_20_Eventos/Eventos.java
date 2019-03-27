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

    public Eventos() {
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
        boton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.setBackground(Color.red);
    }

}
