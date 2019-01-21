/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_EJ_08;

import java.util.GregorianCalendar;

/**
 *
 * @author fsancheztemprano
 */
public class Empleado {

    private String nombre;
    private GregorianCalendar inicio;
    private GregorianCalendar nacimiento;
    private String titulacion;

    public Empleado() {
    }

    public Empleado(String nombre, GregorianCalendar inicio, GregorianCalendar nacimiento, String titulacion) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.nacimiento = nacimiento;
        this.titulacion = titulacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GregorianCalendar getInicio() {
        return inicio;
    }

    public void setInicio(GregorianCalendar inicio) {
        this.inicio = inicio;
    }

    public GregorianCalendar getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(GregorianCalendar nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", inicio=" + inicio.getTime() + ", nacimiento=" + nacimiento.getTime() + ", titulacion=" + titulacion + '}';
    }

    public float calcSueldo(){
        return 20f;
    }
}
