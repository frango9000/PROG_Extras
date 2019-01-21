/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_EJ_08;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author fsancheztemprano
 */
public class Secretaria extends Empleado {

    private String telefonoMovil;

    public Secretaria(String telefonoMovil, String nombre, GregorianCalendar inicio, GregorianCalendar nacimiento, String titulacion) {
        super(nombre, inicio, nacimiento, titulacion);
        this.telefonoMovil = telefonoMovil;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    @Override
    public String toString() {
        return "Secretaria{" + "nombre=" + super.getNombre() + ", inicio=" + super.getInicio().getTime() + ", nacimiento=" + super.getNacimiento().getTime() + ", titulacion=" + super.getTitulacion() + ", telefonoMovil=" + telefonoMovil + '}';
    }

    @Override
    public float calcSueldo() {
        
        return super.calcSueldo()-10f;
    }

}
