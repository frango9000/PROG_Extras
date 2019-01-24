/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Ej_12_Arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author fsancheztemprano
 */
public class MetodosB {

    public static int darValor() {
        return Integer.parseInt(JOptionPane.showInputDialog("Dar Valor "));
    }

    public static int darValor(String str) {
        return Integer.parseInt(JOptionPane.showInputDialog("Dar Valor " + str));
    }

    int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90};


    public void crearArray() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = darValor("Indice " + i);
        }
    }

    public String numerosToString() {
        return Arrays.toString(numeros);
    }

    public void mostrar(){
        ArraysLib.mostrar(numeros);
    }

    public void mostrarForEach() {
        for (int ele : numeros) {
            System.out.println(ele);
        }
    }

    public int buscarIndice(int num){
        return ArraysLib.buscarIndice(numeros, num);
    }

    public void editar(int index, int value) {
        numeros[index] = value;

    }


    public int contarRepetidos(int num) {
        return ArraysLib.contarRepetidos(numeros, num);
    }


    public void arrayDeRepetidos(int num) {
        numeros = ArraysLib.arrayDeRepetidos(numeros, num);
    }


    public void arrayOrdenado() {
        numeros = ArraysLib.arrayOrdenado(numeros);
    }


    public void eliminarNota(int indice) {
        numeros = ArraysLib.eliminarIndice(numeros, indice);
    }


    public void agregarIndice(int indice, int elemento) {
        numeros = ArraysLib.agregarIndice(numeros, indice, elemento);
    }
}
