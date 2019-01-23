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

    int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90};

    public static int darValor() {
        return Integer.parseInt(JOptionPane.showInputDialog("Dar Valor "));
    }

    public static int darValor(String str) {
        return Integer.parseInt(JOptionPane.showInputDialog("Dar Valor " + str));
    }

    public void crearArray() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = darValor("Indice " + i);
        }
    }

    public String numerosToString() {
        return Arrays.toString(numeros);
    }

    public static void mostrar(int[] array) {
        for (int i = 0; i > array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public void mostrar(){
        mostrar(numeros);
    }

    public void mostrarForEach() {
        for (int ele : numeros) {
            System.out.println(ele);
        }
    }

    public int buscarIndice(int num) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public void editar(int index, int value) {
        numeros[index] = value;

    }

    public static int contarRepetidos(int[] array, int num) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                j++;
            }
        }
        return j;
    }

    public int contarRepetidos(int num) {
        return contarRepetidos(numeros, num);
    }

    public static int[] arrayDeRepetidos(int[] array, int num) {
        int size = contarRepetidos(array, num);
        int[] j = new int[size];
        int h = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                j[h] = i;
                h++;
            }
        }
        return j;
    }

    public void arrayDeRepetidos(int num) {
        numeros = arrayDeRepetidos(numeros, num);
    }

    public static int[] arrayOrdenado(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }

    public void arrayOrdenado() {
        numeros = arrayOrdenado(numeros);
    }

    public static int[] eliminarIndice(int[] array, int indice) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indice) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }

    public void eliminarNota(int indice) {
        numeros = eliminarIndice(numeros, indice);
    }

    public static int[] agregarIndice(int[] array, int indice, int elemento) {
        int[] nuevoArray = new int[array.length + 1];
        for (int i = 0; i < nuevoArray.length; i++) {
            if      (i <  indice)nuevoArray[i] = array[i];
            else if (i == indice)nuevoArray[i] = elemento;
            else if (i >  indice)nuevoArray[i] = array[i - 1];            
        }
        return nuevoArray;
    }

    public void agregarIndice(int indice, int elemento) {
        numeros = agregarIndice(numeros, indice, elemento);
    }
}
