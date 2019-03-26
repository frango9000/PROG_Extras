package PROG_Ej_19_Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author fsancheztemprano
 */
public class Test extends JFrame{
   JLabel labelName;
   JLabel labelPass;
   JButton k;
   JButton clear;

    public void ventana() {
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Test");
        this.setVisible(true);
        
        labelName = new JLabel("55");
        this.add(labelName);
    }
    
    

}
