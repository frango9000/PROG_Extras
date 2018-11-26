/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Ej_8;

import java.util.Date;

/**
 *
 * @author fsancheztemprano
 */
public class main {
    public static void main(String[] args) {
        Date date1 = new Date(2015,3,15);
        Secretaria sec1 = new Secretaria("222", "ana", date1, date1, "FP");
        
        sec1.calcSueldo();
        System.out.println(sec1.toString());
        
        Empleado emp1 = new Empleado( "ana", date1, date1, "FP");
        
        emp1.calcSueldo();
        System.out.println(emp1.toString());
    }
    
}
