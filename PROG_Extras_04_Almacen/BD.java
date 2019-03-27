package PROG_Extras_04_Almacen;

import java.util.HashMap;
import java.util.Set;

/**
 * @author fsancheztemprano
 */
public class BD {

    public HashMap<String, Integer> bd = new HashMap<>();

    public void agregar(int ref, String codigo) {
        bd.put(codigo, ref);
    }

    public boolean contiene(String codigo) {
        return bd.containsKey(codigo);
    }

    public int getRef(String codigo) { //get value
        return bd.get(codigo);
    }

    public Object[] arrayOfKeys() {
        return bd.keySet().toArray();
    }

    public String[] arrayOfKeysS() {
        Object[] objects = arrayOfKeys();
        String[] strings = new String[objects.length];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = (String) objects[i];
        }
        return strings;
    }

}
