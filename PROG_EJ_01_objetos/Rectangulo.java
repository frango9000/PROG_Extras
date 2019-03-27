package PROG_EJ_01_objetos;

import java.util.Scanner;

public class Rectangulo {

    private float base;
    private float altura;

    public Rectangulo() {
    }

    public Rectangulo(float b, float h) {
        base = b;
        altura = h;
    }

    public void setBase(float b) {
        base = b;
    }

    public float getBase() {
        return base;
    }

    public void setAltura(float al) {
        altura = al;
    }

    public float getAltura() {
        return altura;
    }

    public float area() {
        float area;
        area = base * altura;
        return area;
    }

    public void perimetro() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Base: ");
        float b = scan.nextFloat();
        System.out.println("Altura: ");
        float h = scan.nextFloat();
        System.out.println("Perimetro :" + (2 * (b + h)));
    }
}
