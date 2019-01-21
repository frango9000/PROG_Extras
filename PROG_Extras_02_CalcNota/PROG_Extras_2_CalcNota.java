/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Extras_02_CalcNota;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Extras_2_CalcNota {
    public static void main(String[] args) {
        float acumuladorNotas=0f;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduce cuantos estudiantes:");
        int cantidadAlumnos = scan.nextInt();
        
        for(int i=1;i <= cantidadAlumnos;i++){
            System.out.println("Estudiante numero: " + i);
            Estudiante estu = new Estudiante();
            estu.pedirDatos();
            acumuladorNotas += estu.calcNotaFinal();
    
        }
        float notaMediaGrupo = Estudiante.calcNotaMediaGrupo(acumuladorNotas, cantidadAlumnos);
        System.out.println("Nota Media Grupo: "+notaMediaGrupo);
        
    


}

    
}
