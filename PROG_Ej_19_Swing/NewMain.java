package PROG_Ej_19_Swing;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author fsancheztemprano
 */
public class NewMain {

    public static void main(String[] args) {
        e5();

    }

    static void e1() {
        JFrame f = new JFrame("Titulo de ventana");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pane = new JPanel();
        pane.setBackground(Color.GREEN);

        JLabel tag = new JLabel("Etiqueta");
        tag.setLocation(50, 100);
        f.add(pane);
        f.add(tag);

        f.setVisible(true);
    }

    static void e2() {
        Ventana1 v = new Ventana1();
        v.crearVentana();
    }

    static void e3() {
        Ventana2 v = new Ventana2();
        v.crearVentana2();
    }

    static void e4() {
        Componentes c = new Componentes();
        c.crearVentana();
    }

    static void e5() {
        Test t = new Test();
        t.ventana();
    }
}
