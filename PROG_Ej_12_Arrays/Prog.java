/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Ej_12_Arrays;

/**
 *
 * @author fsancheztemprano
 */
public class Prog {
    public static void main(String[] args){
        Metodos obj = new Metodos();
        obj.amosarForEach();
        
        System.out.println(obj.buscarIndice(obj.darValor()));
        
        obj.editar(7, 300);
        
        System.out.println(obj.notas[7]);
    }
    
}
