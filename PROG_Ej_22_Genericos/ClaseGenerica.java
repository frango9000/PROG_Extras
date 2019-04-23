package PROG_Ej_22_Genericos;

import java.util.ArrayList;

/**
 * @author fsancheztemprano
 * @param <T>
 */
public class ClaseGenerica <T> {
    private T valor;

    public ClaseGenerica() {
    }

    public ClaseGenerica(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
    public void mostrar(ArrayList<T> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    

}
