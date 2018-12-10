/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_EJ_10_Excepciones;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_EJ_Excepciones {
    public static void main(String[] args) {
        Operaciones op = new Operaciones();
//        op.suma(8, 2);
//        op.resta(3, 2);
//        op.multi(5, 3);
//        op.divis(8, 2);
        try{
            op.all(8, 0);
        }catch(ArithmeticException e){
            System.out.println("Error al divideir entre 0");
        }
    }
    
}
