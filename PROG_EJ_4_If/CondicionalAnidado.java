/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_EJ_4_If;

import javax.swing.JOptionPane;

/**
 *
 * @author fsancheztemprano
 */
public class CondicionalAnidado {

    public void validarConAnidados() {
        int num1, num2;
        String numero1 = JOptionPane.showInputDialog("Teclea el numero 1: ");
        num1 = Integer.parseInt(numero1);
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Teclea el numero 2: "));

        if (num1 > num2) {
            System.out.println(num1 + "es mayor");
        } else {
            if (num2 > num1) {
                System.out.println(num2 + "es mayor");
            } else {
                System.out.println("son iguales");
            }
        }

    }

}
