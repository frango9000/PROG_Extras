/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_EJ_07;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_EJ_7 {

    public static void main(String[] args) {
        Monitor monit = new Monitor("Samsung", 18.5f);
        Rato rat = new Rato(true, "G11");
        Teclado tecl = new Teclado(108);
        Cpu cp = new Cpu(3, 8);

        Ordenador ord1 = new Ordenador(cp, monit, rat, tecl);

        ord1.visualizarAtributosOrdenador();
        System.out.println("Precio: " + ord1.calcularPrecio());
    }
}
