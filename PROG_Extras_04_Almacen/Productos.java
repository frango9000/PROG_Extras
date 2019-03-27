package PROG_Extras_04_Almacen;

import java.util.HashMap;

/**
 * @author fsancheztemprano
 */
public class Productos {

    private HashMap<Integer, Float> productos = new HashMap<>();

    public void agregar(int ref, float precio) {
        productos.put(ref, precio);
    }

    public void cambiarPrecio(int ref, float precio) {
        productos.replace(ref, precio);
    }

    public float getPrecio(int ref) {
        return productos.get(ref);
    }

}
