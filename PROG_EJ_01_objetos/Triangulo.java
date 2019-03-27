package PROG_EJ_01_objetos;

public class Triangulo {

    private float base;
    private float altura;

    public Triangulo() {
    }

    public Triangulo(float b, float al) {
        base = b;
        altura = al;
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
        area = (base * altura) / 2;
        return area;
    }

}
