/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_EJ_04_If;

//import java.util.Scanner;
/**
 *
 * @author fsancheztemprano
 */
public class PROG_EJ_4_If {

    public static void main(String[] args) {
        CondicionalSimple obxCS = new CondicionalSimple();
        //   obxCS.menorEdad();
        CondicionalDoble obxCD = new CondicionalDoble();
        // obxCD.mayorMenorEdad();

        CondicionalAnidado obxCA = new CondicionalAnidado();
        // obxCA.validarConAnidados();

        CondicionalAnidadoElseIf obxCAei = new CondicionalAnidadoElseIf();
        obxCAei.validarConAnidadosElseIf();

    }
}
