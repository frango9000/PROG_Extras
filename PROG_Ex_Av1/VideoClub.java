/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Ex_Av1;

/**
 *
 * @author fsancheztemprano
 */
public class VideoClub {

    private Video video;

    public VideoClub(Video video) {
        this.video = video;
    }

    public void visualiza() {
        System.out.println("Titulo: " + video.getTitulo() + ". Precio: " + video.getPrezo());
    }

    public void rebaja(float rebaja) {
        float prezoAnterior = video.getPrezo();
        float precioNuevo = prezoAnterior - (prezoAnterior * (rebaja / 100f));
        video.darPrezo(precioNuevo);
        System.out.println(video.getTitulo() + " rebajado de " + prezoAnterior + " a " + precioNuevo + ". (" + rebaja + "%)");
    }
}
