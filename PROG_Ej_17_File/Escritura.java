package PROG_Ej_17_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author fsancheztemprano
 */
public class Escritura {

    File file = null;
    PrintWriter pw = null;

    public File escribirNumeros(String nomeFich) {
        file = new File(nomeFich + ".txt");
        //cuando abrimos el fichero para escribir puede no existir entonces lo crea
        // si existe lo machaca y vuelve a empezar a escribir desde el principio SOBREESCRIBE
        //Si quieres añadir hay que usar otro metodo
        try {
            //abrir flujo de escritura
            pw = new PrintWriter(file);
            pw.println(10);
            pw.println(11);
            pw.println(12);

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            pw.close();
        }
        return file;
    }

    //metodo que escribe un objeto
    public void escribirLineas(String nomeFich, ArrayList<Alumno> lista) {
        try {
            pw = new PrintWriter(new File(nomeFich + ".txt"));
            for (Alumno al : lista) {
                pw.println(al.getNombre() + " " + al.getNota());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            pw.close();
        }
    }

    public void agregar(String nomeFich) {
        try {
            //filewriter añade a un fichero: continua escribiendo donde el fichero está vacio
            pw = new PrintWriter(new FileWriter(nomeFich + ".txt", true));
            Alumno a = Alumno.nuevoAlumno();
            pw.println(a);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            pw.close();
        }
    }
}
