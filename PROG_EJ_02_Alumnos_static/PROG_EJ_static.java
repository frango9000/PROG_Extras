/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_EJ_02_Alumnos_static;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_EJ_static {

    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        alu1.amosar();
        Alumno alu2 = new Alumno("F", 1f);
        alu2.amosar();
        alu1.amosar();
        System.out.println(Alumno.getReferencia());
        System.out.println(alu1.getReferencia());
        // System.out.println(Alumno.getReferenciaSt());// err llamado a metodo no estatico que devuelve una variable estatica
        System.out.println(alu1.getReferencia2());

    }

}
