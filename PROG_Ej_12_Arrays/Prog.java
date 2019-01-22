/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Ej_12_Arrays;

import java.util.Arrays;

/**
 *
 * @author fsancheztemprano
 */
public class Prog {
    public static void main(String[] args){
        MetodosB mb = new MetodosB();
        mb.numeros=new int[MetodosB.darValor("indice")];
        mb.crearArray();
        System.out.println(mb.numerosToString());
    }
    
    public static void e1(){
        Metodos obj = new Metodos();
                System.out.println(obj.contarRepetidos(20));
        System.out.println(Arrays.toString(obj.arrayDeRepetidos(20)));
        
        int[] arr=obj.arrayDeRepetidos(20);
        
        for(int i =0;i<arr.length;i++){
            System.out.println(obj.notas[arr[i]]);
            
        }
    }
    public static void e2(){
                Metodos obj = new Metodos();
        //int[] array = Metodos.arrayOrdenado(obj.notas);
        System.out.println(Arrays.toString(obj.notas));
        Arrays.sort(obj.notas);
        System.out.println(Arrays.toString(obj.notas));
    }
    
    public static void e3(){
        Metodos obj = new Metodos();
        
        System.out.println(Arrays.toString(obj.notas));
        System.out.println(Arrays.toString(Metodos.eliminarIndice(obj.notas, 5)));
    }
    
}
