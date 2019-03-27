package PROG_Ej_19_Swing;

import javax.swing.JFrame;

/**
 * @author fsancheztemprano
 */
public class Ventana2 extends JFrame {

    //segundo manera para crear ventanas JFRAME
    //metodo mas directo
    //metodo para Crear VEntana
    public void crearVentana2() {
        //dar tamaño
        setSize(800, 600);
        //acomodar a nuestros gustos
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ventana 2");
        this.setVisible(true);
    }
}
