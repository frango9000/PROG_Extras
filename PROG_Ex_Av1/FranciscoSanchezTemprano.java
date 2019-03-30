/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Ex_Av1;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class FranciscoSanchezTemprano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean repeat = true;
        do {

            Scanner scan = new Scanner(System.in);
            System.out.println("Introduce el titulo de la peli: ");
            String titulo = scan.next();
            System.out.println("Intrduce el precio de la peli: ");
            float prezo = scan.nextFloat();
            Video peli1 = new Video(titulo, prezo);
            VideoClub videoclub = new VideoClub(peli1);

            //cambio de precio
            System.out.println("\nCambiando el precio.\n");
            float nuevoPrecio;
            do {
                System.out.println("Introduce el nuevo precio: ");
                nuevoPrecio = scan.nextFloat();
                if (nuevoPrecio > 0) {
                    peli1.darPrezo(nuevoPrecio);
                } else {
                    System.out.println("\nError, el precio debe ser mayor a 0.\n");
                }
            } while (nuevoPrecio <= 0);

            //rebaja
            System.out.println("Aplicando rebaja.\n");
            float prcent;
            do {
                System.out.println("Introduce el porcentaje a rebajar: ");
                prcent = scan.nextFloat();
                if (prcent > 0 && prcent < 100) {
                    videoclub.rebaja(prcent);
                } else {
                    System.out.println("\nError, el porcentaje de rebaja debe ser mayor a 0 y menor a 100.\n");
                }
            } while (!(prcent > 0) || !(prcent < 100));

            //repetir programa
            boolean err;
            do {
                System.out.println("Repetir Programa? S : si | N : no");
                String respuesta = scan.next();
                if ("s".equalsIgnoreCase(respuesta)) {
                    repeat = true;
                    err = false;
                    System.out.println("Reiniciando programa");
                } else if ("n".equalsIgnoreCase(respuesta)) {
                    repeat = false;
                    err = false;
                    System.out.println("Cerrando programa");
                } else {
                    System.out.println("Error, vuelve a intentarlo.");
                    err = true;
                }
            } while (err == true);
        } while (repeat == true);
    }
}