/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_EJ_2_Alumnos_static;

/**
 *
 * @author fsancheztemprano
 */
public class Alumno {

    private String nome;
    private float nota;
    private int numReferencia; //variable de instancia
    private static int referencia = 6220; //variable de clase

    public Alumno() {
        numReferencia = ++referencia;
    }

    public Alumno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
        numReferencia = ++referencia;
    }

    public void setNumreferencia(int refe) {
        numReferencia = refe;
    }

    public int getNumreferencia() {
        return numReferencia;
    }

    public static int getReferencia() {
        return referencia;
    }

    public int getReferencia2() {
        return referencia;
    }

    public void amosar() {
        System.out.println("Nombre: " + nome + ". Nota: " + nota + ". Referencia: " + numReferencia);
    }

}
