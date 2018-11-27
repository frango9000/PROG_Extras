/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Ej_8;

import java.util.GregorianCalendar;

/**
 *
 * @author fsancheztemprano
 */
public class main {

    public static void main(String[] args) {
        GregorianCalendar date1 = new GregorianCalendar(2015, 3, 15);
        GregorianCalendar date2 = new GregorianCalendar(1998, 3, 15);

        Empleado sec1 = new Secretaria("222", "ana", date1, date2, "FP");

        sec1.calcSueldo();
        System.out.println(sec1.toString());

        Empleado emp1 = new Empleado("ana", date1, date2, "FP");
        System.out.println(emp1.calcSueldo());
        System.out.println(emp1.toString());

        Empleado sec2 = new Secretaria("232", "ped", new GregorianCalendar(2015, 3, 15), new GregorianCalendar(2015, 3, 15), "FP");

        System.out.println(sec2.toString());
        System.out.println(sec2.getNombre());

        System.out.println(sec2.calcSueldo());
    }

}
