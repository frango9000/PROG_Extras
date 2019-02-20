package PROG_Ej_17_File;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * @author fsancheztemprano
 */
public class Lectura {
    Scanner scan;
    public void leerPalabras(File file){
        try{
            scan = new Scanner(file);
        }catch(FileNotFoundException ex){
            System.out.println("No se encuentra el archivo");
        }
    
    }

}
