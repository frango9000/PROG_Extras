package PROG_Ej_22_Genericos;

import java.util.ArrayList;

/**
 * @author fsancheztemprano
 */
public class NewMain {
    public static void main(String[] args) {
        
        e5();
    }
    
    static void e1(){
        ClaseObject obx1 = new ClaseObject();
        obx1.setVariable("aaa");
        String str = (String)obx1.getVariable();
        System.out.println(str);
    }
    static void e2(){
        ClaseObject obx1 = new ClaseObject();
        Persona per = new Persona("ana",2000);
        obx1.setVariable(per);
        Persona per2 = (Persona)obx1.getVariable();
    }
    static void e3(){
        ClaseGenerica<String> gen1 = new ClaseGenerica<>();
        gen1.setValor("bbb");
        System.out.println(gen1.getValor());        
    }
    static void e4(){
        ClaseGenerica<Persona> gen1 = new ClaseGenerica<>();
        gen1.setValor(new Persona("ana", 1100));
        System.out.println(gen1.getValor().toString());
    }
    static void e5(){
        ClaseGenerica<Persona> gen1 = new ClaseGenerica<>();
        ArrayList<Persona> listap = new ArrayList<>();
        listap.add(new Persona("Ana", 1000));
        listap.add(new Persona("Juan",1009));
        gen1.mostrar(listap);
    }
}