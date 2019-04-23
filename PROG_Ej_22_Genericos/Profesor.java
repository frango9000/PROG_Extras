package PROG_Ej_22_Genericos;
/**
 * @author fsancheztemprano
 */
public class Profesor extends Persona {
    private String modulo;

    public Profesor() {
    }

    public Profesor(String nombre, float sueldo, String modulo) {
        super(nombre, sueldo);
        this.modulo = modulo;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Modulo = " + modulo;
    }
    
    

}
