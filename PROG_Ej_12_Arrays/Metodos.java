/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Ej_12_Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author fsancheztemprano
 */
public class Metodos {
    int[] notas ={10,20,30,40,50,60,70,80};
    
   public int darValor(){
    return Integer.parseInt(JOptionPane.showInputDialog("dar Valor"));
   }
   public void crearArray(){
       for(int i =0;i<notas.length;i++){
           notas[i]=darValor();
       }
   }
    
    public void amosar(){
        for(int i=0; i>notas.length;i++){
            System.out.println(notas[i]);
        }
    }
    public void amosarForEach(){
        for(int ele : notas){
            System.out.println(ele);
        }
    }
    public int buscarIndice(int num){
        for (int i =0;i<notas.length;i++){
            if (notas[i]==num) return i;
        }
        return -1;
    }
    public void editar(int index, int value){
        notas[index]=value;
        
    }
    public int contarRepetidos(int num){
        int j=0;
        for(int i =0;i<notas.length;i++)
            if (notas[i]==num){
                j++;                
        }
        return j;
    }
    
    public int[] arrayDeRepetidos(int num){
        int[] j = new int[contarRepetidos(num)];
    }
    
}
