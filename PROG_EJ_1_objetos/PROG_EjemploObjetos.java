/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_EJ_1_objetos;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_EjemploObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo objRectangulo1 = new Rectangulo(3f,5f);
        float respuesta = objRectangulo1.area();
        System.out.println("Rectangulo area: " + respuesta);
        
        Triangulo objTriangulo2 = new Triangulo(4f,2f);
        float respuesta2 = objTriangulo2.area();
        System.out.println("Triangulo area: " + respuesta2);
        
        float areasSumadas = objTriangulo2.area() + objRectangulo1.area();
        
        System.out.println("Areas Sumadas: " + areasSumadas);
        
        //Rectangulo.perimetro();
        
        //?????????????
        
    }
    
}
