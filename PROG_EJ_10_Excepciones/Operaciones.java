package PROG_EJ_10_Excepciones;

public class Operaciones {
    public void suma(int i, int j){
        System.out.println("Suma numero: "+i+" + "+j+" = "+ (i+j));
    }
    public void resta(int i, int j){
        System.out.println("Resta numero: "+i+" - "+j+" = "+ (i-j));
    }
    public void multi(int i, int j){
        System.out.println("Multiplicacion numero: "+i+" x "+j+" = "+ (i*j));
    }
    public void divis(int i, int j){
        System.out.println("Division numero: "+i+" / "+j+" = "+ (i/j));
    }
    public void all(int i, int j){
        suma(i,j);
        resta(i,j);
        multi(i,j);
        divis(i,j);
    }
}
