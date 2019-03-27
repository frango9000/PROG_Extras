package PROG_Ej_18_FicheroSerializable;

import java.io.Serializable;
import java.util.Scanner;

/**
 * @author fsancheztemprano
 */
public class Alumno implements Serializable {

    private String nombre;
    private int nota;

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }

    public static Alumno nuevoAlumno() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce nombre ");
        String nombre = scan.nextLine();
        System.out.print("Introduce nota ");
        int nota = scan.nextInt();
        return new Alumno(nombre, nota);
    }

}
