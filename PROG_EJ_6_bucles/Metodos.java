/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_EJ_6_bucles;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class Metodos {
    private int nota;
    public void bucleWhile(){
        nota = pedirNota(); 
        while(nota >= 5){
            System.out.println("Aprobado");
            nota = pedirNota();
        }
    }
    public void bucleDoWhile(){
        do{
            nota = pedirNota(); 
            System.out.println("Aprobado");
        }while(pedirNota()>=5);
        
    }
    public void bucleFor() {
        for (int i = 0; i < 5; i++) {
            nota = pedirNota();
            if (nota >= 5) {
                System.out.println("Aprobado");
            }
        }
    }

    public int pedirNota() {
        int intro;
        String tag = "";
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println(tag+"Introduce la nota: ");
            intro = scan.nextInt();
            tag = "Nota no valida (1,10): "+intro+"\n";
        } while (intro < 1 || intro > 10);
        return intro;
    }
}
