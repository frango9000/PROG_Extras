package PROG_Extras_04_Almacen;

import java.util.HashMap;

/**
 * @author fsancheztemprano
 */
public class Almacen {

    public HashMap<Integer, Integer> almacen = new HashMap<>();

    public void agregar(int ref, int unidades) {
        almacen.put(ref, unidades);
    }

    public void restock(int ref, int nuevasUnidades) {
        int actual = almacen.get(ref);
        almacen.replace(ref, actual + nuevasUnidades);
    }

    public int getUnidades(int ref) {
        return almacen.get(ref);
    }
}
