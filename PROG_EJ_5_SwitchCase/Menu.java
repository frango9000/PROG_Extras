/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_EJ_5_SwitchCase;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class Menu {

    public static void sout(String a) {
        System.out.println(a);
    }

    public static int requestNumber() {
        System.out.println("MENU:\n1 - Lunes\n2 - Martes\n3 - Miercoles\n4 - Jueves\n5 - Viernes\n6 - Sabado\n7 - Domingo\nElige una opcion: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static boolean validarDia(int i) {
        switch (i) {
            case 1:
                Menu.sout("Lunes");
                return true;
            case 2:
                Menu.sout("Martes");
                return true;
            case 3:
                Menu.sout("Miercoles");
                return true;
            case 4:
                Menu.sout("Jueves");
                return true;
            case 5:
                Menu.sout("Viernes");
                return true;
            case 6:
                Menu.sout("Sabado");
                return true;
            case 7:
                Menu.sout("Domingo");
                return true;
            default:
                return false;
        }
    }

}
