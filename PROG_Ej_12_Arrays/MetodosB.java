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
public class MetodosB {
    int[] numeros;
    
   public static int darValor(){
    return Integer.parseInt(JOptionPane.showInputDialog("Dar Valor "));
   }
   public static int darValor(String str){
    return Integer.parseInt(JOptionPane.showInputDialog("Dar Valor " + str));
   }
   public void crearArray(){
       for(int i =0;i<numeros.length;i++){
           numeros[i]=darValor("Indice " + i);
       }
   }
    
    public void amosar(){
        for(int i=0; i>numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }
    public void amosarForEach(){
        for(int ele : numeros){
            System.out.println(ele);
        }
    }
    public int buscarIndice(int num){
        for (int i =0;i<numeros.length;i++){
            if (numeros[i]==num) return i;
        }
        return -1;
    }
    public void editar(int index, int value){
        numeros[index]=value;
        
    }
    public int contarRepetidos(int num){
        int j=0;
        for(int i =0;i<numeros.length;i++)
            if (numeros[i]==num){
                j++;                
        }
        return j;
    }
    
    public int[] arrayDeRepetidos(int num){
        int size=contarRepetidos(num);
        int[] j = new int[size];
        int h=0;
         for(int i =0;i<numeros.length;i++){
            if (numeros[i]==num){
                j[h]=i;
                h++                ;
            }
        }
         return j;
    }
    
    public static int[] arrayOrdenado(int[] array){
        for(int i = 0;i<array.length;i++){
            for(int j =i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;                 
                    
                }
                
            }
        }
        return array;
    }
    
    public void notasOrdenadas(){
        numeros=arrayOrdenado(numeros);        
    }
    
    public static int[] eliminarIndice(int[] array, int indice){
        int[] newArray = new int[array.length-1];
        for (int i =0,j=0;i<array.length;i++){
            if(i!=indice){
                newArray[j]=array[i];
                j++;
            }
        }
        return newArray;
    }
    
    public void eliminarNota(int indice){
        numeros=eliminarIndice(numeros, indice);
    }
}
