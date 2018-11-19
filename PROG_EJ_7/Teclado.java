/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_EJ_7;

/**
 *
 * @author fsancheztemprano
 */
public class Teclado {

    private int numTeclas;

    public Teclado(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    public int getNumTeclas() {
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }
    public void visualizarAtributosTeclado() {
        System.out.println("Teclado:\nNumero de Teclas: " + getNumTeclas());
    }
}
