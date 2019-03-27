/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Extras_01;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Extras_1_2 {

    public static void main(String[] args) {
        final double PI = Math.PI;
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Introduce el radio: ");
        float radio = scanIn.nextFloat();
        double longitud = 2 * radio * PI;
        double area = Math.pow(radio, 2) * PI;
        double volumen = 4 / 3 * Math.pow(radio, 3) * PI;

        System.out.println("Longitud: " + longitud + "\nArea: " + area + "\nVolumen: " + volumen);
    }
}
