/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Extras_1;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Extras_1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            final float PI = 3.14f;
            Scanner scanIn = new Scanner(System.in);
            System.out.println("Introduce el radio: ");
            float radio = scanIn.nextFloat();
            float longitud = 2 * radio * PI;
            float area = radio * radio * PI;
            float volumen = 4 / 3 * radio * radio * radio * PI;
            
            System.out.println("Longitud: " + longitud + "\nArea: " + area + "\nVolumen: " + volumen );
    }
    
}
