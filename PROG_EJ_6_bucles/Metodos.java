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
    public void bucleFor(){
        
    }
    
    public int pedirNota(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce la nota: ");
        return scan.nextInt();  
    }
}
