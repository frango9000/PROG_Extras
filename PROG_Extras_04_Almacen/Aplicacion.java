package PROG_Extras_04_Almacen;

/**
 * @author fsancheztemprano
 */
public class Aplicacion {

    public static void main(String[] args) {
        Controlador ct = new Controlador();
        ct.agregar("C1", 5, 2.5f);
        ct.agregar("C2", 2, 25f);
        ct.agregar("C3", 2, 100.5f);

        ct.print();

        ct.agregar("C2", 10, 25f);

        ct.print();
    }
}
