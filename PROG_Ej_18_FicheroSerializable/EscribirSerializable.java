package PROG_Ej_18_FicheroSerializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author fsancheztemprano
 */
public class EscribirSerializable {

    ObjectOutputStream file;
    FileOutputStream f;

    public void escribirObjeto(String filename) {
        try {
            f = new FileOutputStream(filename + ".dat");
            file = new ObjectOutputStream(f);

            for (int i = 0; i < 3; i++) {
                Alumno al = new Alumno("n" + i, i + 1);
                file.writeObject(al);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
        } catch (IOException ex) {
            System.out.println("IOException");

        } finally {
            try {
                file.close();
                f.close();
            } catch (IOException ex) {
                System.out.println("IOException");
            }
        }
    }

    public void agregarObjetos(String filename) {
        try {
            f = new FileOutputStream(filename + ".dat", true);
            file = new HeadlessObjectOutputStream(f);

            for (int i = 6; i < 10; i++) {
                Alumno al = new Alumno("n" + i, i + 1);
                file.writeObject(al);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
        } catch (IOException ex) {
            System.out.println("IOException");

        } finally {
            try {
                file.close();
                f.close();
            } catch (IOException ex) {
                System.out.println("IOException");
            }
        }
    }

}
