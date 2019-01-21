package PROG_EJ_03_Alumnos_2;

import java.util.Scanner;

public class Alumno {

    private String nome;
    private float nota;
    private int numReferencia; //variable de instancia
    private static int referencia = 6220; //variable de clase
    private Direccion direccion = new Direccion();

    public Alumno() {
        numReferencia = ++referencia;
    }

    public Alumno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
        numReferencia = ++referencia;   
    }
    
    public Alumno(String nome, float nota, String cal, String pob, int tlf) {
        this.nome = nome;
        this.nota = nota;
        numReferencia = ++referencia;
  
        direccion.setCalle(cal);
        direccion.setPoblacion(pob);
        direccion.setTelefono(tlf);
  
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

    public void amosar() {
        System.out.println("Nombre: " + nome + ". Nota: " + nota + ". Referencia: " + numReferencia);
        System.out.println("Direccion: " + direccion.getCalle() + ". Poblacion: " + direccion.poblacion + ". Telefono: " + direccion.getTelefono());
    }

    public class Direccion {

        private String calle;
        private String poblacion;
        private int telefono;

        public Direccion() {

        }

        public Direccion(String cal, String pob, int tlf) {
            calle = cal;
            poblacion = pob;
            telefono = tlf;
        }

        public void setCalle(String cal) {
            calle = cal;
        }

        public String getCalle() {
            return calle;
        }

        public void setPoblacion(String pob) {
            poblacion = pob;
        }

        public String getPoblacion() {
            return poblacion;
        }

        public void setTelefono(int tlf) {
            telefono = tlf;
        }

        public int getTelefono() {
            return telefono;
        }

        public void amosarDirecc() {
            System.out.println("Calle: " + calle + ". Poblacion: " + poblacion + ". Telefono: " + telefono);
        }
    }
}
