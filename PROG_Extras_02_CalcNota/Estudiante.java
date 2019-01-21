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
public class Estudiante {
    
    private float notaTeorico1;
    private float notaTeorico2;
    private float notaPractico;
    private int boletines;
    private int boletinesTotales;

    public Estudiante() {
    }

    public Estudiante(float notaTeorico1, float notaTeorico2, float notaPractico) {
        this.notaTeorico1 = notaTeorico1;
        this.notaTeorico2 = notaTeorico2;
        this.notaPractico = notaPractico;
    }

    public float getNotaTeorico1() {
        return notaTeorico1;
    }

    public void setNotaTeorico1(float notaTeorico1) {
        this.notaTeorico1 = notaTeorico1;
    }

    public float getNotaTeorico2() {
        return notaTeorico2;
    }

    public void setNotaTeorico2(float notaTeorico2) {
        this.notaTeorico2 = notaTeorico2;
    }

    public float getNotaPractico() {
        return notaPractico;
    }

    public void setNotaPractico(float notaPractico) {
        this.notaPractico = notaPractico;
    }

    
    public float calcMediaTeorica(){
        return (notaTeorico1 + notaTeorico2)/2;
    }
    public float calcPtosTeorica(){
        return calcMediaTeorica() * 0.4f;
    }
    public float calcPtosPractica(){
        return notaPractico* 0.4f;
    }
    public float ratioBoletines(){
        return (boletines *100)/boletinesTotales;
    }
    public float calcPtosBoletines(){
        if(ratioBoletines()>90f){
            return 2f;
        }else if(ratioBoletines()>70f){
            return 1f;
        }else return 0f;
    }
    
    public float calcNotaFinal(){
        float notaFinal=calcPtosTeorica() + calcPtosPractica() + calcPtosBoletines();
        System.out.println("Media estudiante: " + notaFinal);
        return Math.round(notaFinal);
    }
    
    public void pedirDatos(){
        
        notaTeorico1 = pedirNota("Teorica 1");
        notaTeorico2 = pedirNota("Teorica 2");
        notaPractico = pedirNota("Practica");
        
        
        boletines = pedirBoletines("Completados");
        boletinesTotales = pedirBoletines("Totales");
                
        
    }
    public float validarNota(float fl){
        if(fl <0 || fl>10)
            return 0;
        else
            return fl;
    }
    public float pedirNota(String str){
        float nota =0f;
        String msg ="";
        while ( validarNota(nota)<1){
        Scanner scan = new Scanner(System.in);
        System.out.println(msg+"Introduce Nota "+str+": ");
        nota = scan.nextFloat();
        msg="No valida intentalo de nuevo\n";
        }
        return nota;
    }
    public int pedirBoletines(String str) {
        int bol = -1;
        while (bol < 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Introduce boletines " + str + ": ");
            bol = scan.nextInt();

        }
        return bol;
    }
        public static float calcNotaMediaGrupo(float f, int i){
        return f / i;
    }
}
