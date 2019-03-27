package PROG_Ej_20_Eventos;

/**
 * @author fsancheztemprano
 */
public class NewMain {

    public static void main(String[] args) {
        e1();

    }

    static void e1() {
        Eventos e = new Eventos();
        e.crearVentana();
    }

    static void e2() {
        EventosInner e = new EventosInner();
        e.crearVentana();
    }

    static void e3() {
        EventosAnon e = new EventosAnon();
        e.crearVentana();
    }
}
