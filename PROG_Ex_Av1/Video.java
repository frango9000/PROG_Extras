/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_ex_1;

/**
 *
 * @author fsancheztemprano
 */
public class Video {

    private String titulo;
    private float prezo;

    public Video(String titulo, float prezo) {
        this.titulo = titulo;
        this.prezo = prezo;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getPrezo() {
        return prezo;
    }

    public void darPrezo(float prezo) {
        this.prezo = prezo;
    }

}
