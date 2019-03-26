package PROG_Ej_19_Swing;
/**
 * @author fsancheztemprano
 */
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Componentes {
    
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    JLabel etiqueta;
    JTextField lineaTxt;
    JComboBox<String> box;
    
    public void crearVentana(){
        //INSTANCIACION
        marco = new JFrame("Marco");
        panel = new JPanel();
        boton1 = new JButton("Boton1");
        boton2 = new JButton("Boton2");
        etiqueta = new JLabel();
        lineaTxt = new JTextField(20);
        box = new JComboBox<>();
        
        
        //CARACTERISTICAS
        marco.setSize(800, 400);
        panel.setSize(800, 400);
        panel.setBackground(Color.red);
        etiqueta.setText("NombreEtiqueta");
        etiqueta.setBounds(50, 100, 50, 10);
        boton1.setBounds(200, 300, 20, 10);
        boton2.setBounds(400, 300, 20, 10);
        lineaTxt.setBounds(100, 100, 30, 20);
        box.setBounds(400, 400, 40, 400);
        //box.set
        
        //AÑADIR COMPONENTES
        //al panel
        panel.add(etiqueta);
        panel.add(lineaTxt);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(box);
        // al marco
        marco.add(panel);
        
        //HACEMOS VISIBLE EL MARCO
        marco.setVisible(true);
        
        //CIERRE EN X
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //DESACTIVAMOS Layout PARA PERSONALIZAR
        panel.setLayout(null);
    }
}