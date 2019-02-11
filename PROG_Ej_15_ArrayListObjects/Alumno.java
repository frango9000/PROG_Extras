package PROG_Ej_15_ArrayListObjects;
//@author fsancheztemprano

import java.util.Objects;
import java.util.Scanner;

public class Alumno implements Comparable {
    String nombre;
    String dni;
    int nota;

    public Alumno() {
    }

    public Alumno(String nombre, String dni, int nota) {
        this.nombre = nombre;
        this.dni = dni;
        this.nota = nota;
    }
    public static Alumno crearAlumno(){
        return new Alumno(pediDatos("Nombre"), pediDatos("DNI"), Integer.parseInt(pediDatos("Nota")));
    }
    public static String pediDatos(String msg){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Introduce %s", msg);
        return scan.next();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", dni=" + dni + ", nota=" + nota + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object t) {
        Alumno alumno = (Alumno) t;
        if (this.nombre.compareTo(alumno.nombre) > 0) {
            return 1;
        } else if (this.nombre.compareTo(alumno.nombre) < 0) {
            return -1;
        } else {
         return 0;   
        }
    }

}
