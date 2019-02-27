package PROG_Ej_17_File;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author fsancheztemprano
 */
public class Lectura {
    public Scanner scan;
    public void leerPalabras(File file){
        try{
            scan = new Scanner(file).useDelimiter(" *, *");            
            while(scan.hasNext()){
                System.out.println(scan.next());
            }
        }catch(FileNotFoundException ex){
            System.out.println("No se encuentra el archivo");
        }finally{
            scan.close();
        }
    }
    
    public ArrayList<Integer> leerNumeros(File file){
        ArrayList<Integer> lista = new ArrayList<>();
        try{
            scan = new Scanner(file).useDelimiter(",");
            while(scan.hasNextInt()){
                lista.add(scan.nextInt());
            }
                    
        }catch (FileNotFoundException ex){
            System.out.println("No se encuentra el archivo");
        }finally{
            scan.close();
        }
        return lista;
    }
    
        public void leerDelimitador(File fich) {
        try {
            scan = new Scanner(fich).useDelimiter("\\s*,\\s*");
            // \\s* para que coja los espacios que tenga sea uno o varios
            while (scan.hasNext()) {
                System.out.println(scan.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            scan.close();
        }
    }
    
    public ArrayList<Alumno> leerAlumnos(File file){
        ArrayList<Alumno> lista = new ArrayList<>();
        try{
            scan = new Scanner(file);
            while(scan.hasNextLine()){
                String[] alumno = scan.nextLine().split(" ");
                Alumno al= new Alumno(alumno[0], Integer.parseInt(alumno[1]));
                lista.add(al);
            }
                
        }catch (FileNotFoundException ex){
            System.out.println("No se encuentra el archivo");        
        }finally{
            scan.close();
        }
        return lista;        
    }

}
