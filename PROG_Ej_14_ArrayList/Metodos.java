package PROG_Ej_14_ArrayList;
//@author fsancheztemprano

import com.f.lib.IO;
import java.util.ArrayList;
import java.util.Iterator;

public class Metodos {
    
    public static void agregar(ArrayList<Integer> lista){
        lista.add(Integer.parseInt(IO.input("titulo", "introducir numero")));
    }
    public static void mostrarFor(ArrayList<Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));            
        }
    }
    public static void mostrarForEach(ArrayList<Integer> lista){
        for (Integer integer : lista) {
            System.out.println(integer);            
        }
    }
    public static void mostrarIterador(ArrayList<Integer> lista){
        Iterator it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static int eliminarIndex(ArrayList<Integer> lista, int posicion){
        return lista.remove(posicion);   
    }
    public static boolean eliminarElemento(ArrayList<Integer> lista, int elemento){
        Integer num = elemento;
        return lista.remove(num);        
    }
}
