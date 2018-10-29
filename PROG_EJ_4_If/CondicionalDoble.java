/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_EJ_4_If;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class CondicionalDoble {

    public void mayorMenorEdad() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Intro edad:");
        int edad = scan.nextInt();
        if (edad < 18) {
            System.out.println("menos de 18");
        } else {
            System.out.println("mayor de 18");
        }
        System.out.println("fin");
    }
}
