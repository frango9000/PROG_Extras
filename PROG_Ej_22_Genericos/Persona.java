package PROG_Ej_22_Genericos;

/**
 * @author fsancheztemprano
 */

public class Persona {

    private String nome;
    private float soldo;

    public Persona() {
    }

    public Persona(String nome, float soldo) {
        this.nome = nome;
        this.soldo = soldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSoldo() {
        return soldo;
    }

    public void setSoldo(float soldo) {
        this.soldo = soldo;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + ", Soldo = " + soldo;
    }

    public float calcularSoldo() {
        return 1500;
    }

}
