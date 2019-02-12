package PROG_Ej_16_HashMap;
//@author fsancheztemprano

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import static lib.LibreriaPROG.pedirDato;

public class Secretaria {
    public static int refe = 6000;
    
    public void crear(HashMap<String,Alumno> lAlumnos, String Dni, Alumno alumno){
        if(lAlumnos.containsKey(Dni))
            System.out.println("Ya existe ese dni en la lista");
        else lAlumnos.put(Dni, new Alumno(pedirDato("Nombre"), Integer.parseInt(pedirDato("nota") ) ) );
    }
    
    public void mostrarLista(HashMap<String,Alumno> lAlumnos){
        Iterator<String> it = lAlumnos.keySet().iterator();
        while(it.hasNext()){
            System.out.println(lAlumnos.get(it.next()));
        }
    }
    public ArrayList<Alumno> valoresALista(HashMap<String,Alumno> lAlumnos){
        ArrayList<Alumno> lista = new ArrayList<>();
        lista.addAll(lAlumnos.values());
        return lista;
    }
    public boolean eliminar(HashMap<String,Alumno> lAlumnos, String dni){
        if(lAlumnos.containsKey(dni)){
            lAlumnos.remove(dni);
            return true;
        }
        System.out.println("No existe este alumno");
        return false;            
    }
    public void modificarNota(HashMap<String,Alumno> lAlumnos, String dni, int nota){
        lAlumnos.get(dni).setNota(nota);
    }

}
