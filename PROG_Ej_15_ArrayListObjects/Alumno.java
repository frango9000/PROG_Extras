package PROG_Ej_15_ArrayListObjects;
//@author fsancheztemprano
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
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
