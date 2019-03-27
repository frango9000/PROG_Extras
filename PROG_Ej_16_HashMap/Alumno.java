package PROG_Ej_16_HashMap;
//@author fsancheztemprano

public class Alumno {

    private String nombre;
    private int ref;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
        this.ref = Secretaria.refe;
        Secretaria.refe++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

}
