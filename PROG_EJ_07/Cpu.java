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
public class Cpu {

    private int nucleos;
    private int ram;

    public Cpu(int nucleos, int ram) {
        this.nucleos = nucleos;
        this.ram = ram;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    public void visualizarAtributosCpu() {
        System.out.println("CPU:\nNucleos: " + getNucleos() + "\nRam: " + getRam());
    }
}
