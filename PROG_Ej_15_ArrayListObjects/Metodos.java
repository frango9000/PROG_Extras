package PROG_Ej_15_ArrayListObjects;
//@author fsancheztemprano

import java.util.ArrayList;
import java.util.Iterator;

public class Metodos {

    public static void append(ArrayList<Alumno> list){
        list.add(Alumno.crearAlumno());
    }
    public static void printList(ArrayList<Alumno> list){
        for (Alumno alumno : list) {
            System.out.println(alumno);
        }
    }
    public static void printIterator(ArrayList<Alumno> list){
        Iterator<Alumno> it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
    public static void removeIndex(ArrayList<Alumno> list, int index){
        list.remove(index);
    }
    public static void removeAlumno(ArrayList<Alumno> list, String dni){
        Iterator<Alumno> it = list.iterator();
        while(it.hasNext()){
            if( it.next().getDni().equalsIgnoreCase( dni ) ){
                it.remove();
            }
        }
    }
    public static Alumno alumnoDNI(ArrayList<Alumno> list, String dni){
        Iterator<Alumno> it = list.iterator();
        while (it.hasNext()) {
            Alumno a = it.next();
            if(a.getDni().equals(dni))
                return a;
        }
        return null;
    }
    public static int indexDNI(ArrayList<Alumno> list, String dni){
        for (int i = 0; i < list.size(); i++) {
            Alumno a = list.get(i);
            if(a.getDni().equalsIgnoreCase(dni))
                return i;            
        }
        return -1;
    }
    public static void cambiarNota(ArrayList<Alumno> list, String dni){
        
    }
}
