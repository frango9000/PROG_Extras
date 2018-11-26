/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Ej_8;

import java.util.Date;

/**
 *
 * @author fsancheztemprano
 */
public class Empleado {
    private String nombre;
    private Date inicio;
    private Date nacimiento;
    private String titulacion;

    public Empleado() {
    }

    public Empleado(String nombre, Date inicio, Date nacimiento, String titulacion) {
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

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
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
        return "Empleado{" + "nombre=" + nombre + ", inicio=" + inicio + ", nacimiento=" + nacimiento + ", titulacion=" + titulacion + '}';
    }
    
    public void calcSueldo(){
        System.out.println("calc");
    }
}
