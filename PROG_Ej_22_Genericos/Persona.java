package PROG_Ej_22_Genericos;

/**
 * @author fsancheztemprano
 */
public class Persona {

    private String nombre;
    private float sueldo;

    public Persona() {
    }

    public Persona(String nombre, float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre + ", Sueldo = " + sueldo;
    }

}
