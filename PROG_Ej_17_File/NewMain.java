package PROG_Ej_17_File;

import java.io.File;
import java.util.Iterator;

/**
 * @author fsancheztemprano
 */
public class NewMain {
    public static void main(String[] args) {
            Lectura obx = new Lectura();
        File file = new File("./src/PROG_Ej_17_File/leer.txt");
        Iterator<Alumno> alumnos = obx.leerAlumnos(file).iterator();
                while(alumnos.hasNext()){
            System.out.println(alumnos.next());
        }
        
            
    }
    
    
    
    
    void e1(){
        Lectura obx = new Lectura();
        File file = new File("./src/PROG_Ej_17_File/leer.txt");
                
        Iterator<Integer> it = obx.leerNumeros(file).iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}