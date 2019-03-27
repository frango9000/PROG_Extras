package PROG_EJ_03_Alumnos_2;

public class PROG_EJ_static {

    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        alu1.amosar();
        Alumno alu2 = new Alumno("F", 1f);
        alu2.amosar();
        Alumno alu3 = new Alumno("P", 1f, "calle", "vigo", 1243124);
        alu3.amosar();

    }

}
