package PROG_Ej_15_ArrayListObjects;
//@author fsancheztemprano

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Alumno a1 = new Alumno("N1", "5k", 10);
        alumnos.add(a1);
        System.out.println(alumnos.toString());

    }

}
