/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Ej_11_Paquetes;

import PROG_Ej_11_Paquetes_Taller.*;

import PROG_Ej_11_Paquetes_Almacen.*;

import PROG_Ej_11_Paquetes_Personal.*;

/**
 *
 * @author fsancheztemprano
 */
public class Aplication {

    public static void main(String[] args) {

        Reparacion rep = new Reparacion();
        Entrada in = new Entrada();
        NumeroVitrasa nv = new NumeroVitrasa();
        rep.reparacion();

        nv.toString();

    }

}
