package PROG_Ej_18_FicheroSerializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author fsancheztemprano
 */
public class LecturaSerializable {
    ObjectInputStream read;
    FileInputStream file;
    Alumno al;
    
    public void leerObjeto(String filename){
        try{
            file = new FileInputStream(filename + ".dat");
            read = new ObjectInputStream(file);
            
            al = (Alumno) read.readObject();
            System.out.println(al);
            
            
            
        }catch (ClassNotFoundException | FileNotFoundException ex) {
            System.out.println("FileNotFoundException"); 
        }catch (IOException ex) {
            System.out.println("IOException");         
        }finally{
                try{
                file.close();
                read.close();
            }catch (IOException ex) {
                System.out.println("IOException");                
            }
        }
    }

}
