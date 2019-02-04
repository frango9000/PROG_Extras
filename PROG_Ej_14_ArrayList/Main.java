package PROG_Ej_14_ArrayList;
//@author fsancheztemprano

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        e2();

    }
    
    static void e1(){
        ArrayList lista = new ArrayList();
        System.out.println(lista.size());
        lista.add("AAA");
        System.out.println(lista.size());
        lista.add(1);
        System.out.println(lista.toString());
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    static void e2(){
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println(lista.size());
        //lista.add("AAA");
        System.out.println(lista.size());
        lista.add(1);
        for (int i = 0; i < 10; i++) {
            lista.add(i);
            
        }
        System.out.println(lista.toString());
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    static void e3(){
                ArrayList<Integer> lista = new ArrayList<>();
        System.out.println(lista.size());
        //lista.add("AAA");
        lista.add(1);
        for (int i = 0; i < 10; i++) {
            lista.add(i);
        }
        System.out.println(lista.size());
        System.out.println(lista.toString());

        Metodos.mostrarIterador(lista);
    }
}
