package PROG_Ej_17_File;

import java.io.File;

/**
 * @author fsancheztemprano
 */
public class NewMain {
    public static void main(String[] args) {
        Lectura obx = new Lectura();
        File file = new File("./src/PROG_Ej_17_File/leer.txt");
        obx.leerPalabras(file);
        
        
        


    }
}