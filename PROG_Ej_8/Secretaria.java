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
public class Secretaria extends Empleado {
    private String telefonoMovil;

    public Secretaria(String telefonoMovil, String nombre, Date inicio, Date nacimiento, String titulacion) {
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
        return "Secretaria{" + "nombre=" + super.getNombre() + ", inicio=" + super.getInicio() + ", nacimiento=" + super.getNacimiento() + ", titulacion=" + super.getTitulacion() + "telefonoMovil=" + telefonoMovil +'}';
    }

 
    
    
}
