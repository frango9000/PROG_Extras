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
public class Ordenador {

    private Cpu cpu;
    private Monitor monitor;
    private Rato rato;
    private Teclado teclado;

//    public Ordenador(Cpu cpu, Monitor monitor, Rato rato, Teclado teclado) {
//        this.cpu = cpu;
//        this.monitor = monitor;
//        this.rato = rato;
//        this.teclado = teclado;
//    }
    public Ordenador(Cpu cp, Monitor monit, Rato rat, Teclado tecl) {
        this.cpu = cp;
        this.monitor = monit;
        this.rato = rat;
        this.teclado = tecl;
    }

    public float calcularPrecio() {
        float ratoInalambrico = 1;
        if (rato.isInalambrico()) {
            ratoInalambrico += 0.5f;
        }
        return cpu.getRam() * 5f + teclado.getNumTeclas() * 0.7f + monitor.getPulgadas() * 12f + ratoInalambrico;
    }

    public void visualizarAtributosOrdenador() {
        System.out.println("Ordenador: \n");
        monitor.visualizarAtributosMonitor();
        rato.visualizarAtributosRato();
        teclado.visualizarAtributosTeclado();
        cpu.visualizarAtributosCpu();
    }
}
