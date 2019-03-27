package PROG_Ej_13_Array2D;
//@author fsancheztemprano

public class Notas {

    int[][] notas = {{7, 9, 6}, {3, 8, 9}, {5, 6, 4}};

    public void mostrar() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas Alumno " + i + " : ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Modulo " + j + " : " + notas[i][j]);
            }
        }
    }

    public void mostrarMediaAlumno() {

    }

    public void mostrarMediaModulo() {
        for (int i = 0; i < notas.length; i++) {
            float media = 0;
            for (int j = 0; j < notas[i].length; j++) {
                media += notas[i][j];
            }
            media /= notas[i].length;
            System.out.println("Modulo " + i + " Nota media = " + media);
        }
    }

}
