package PROG_EJ_10_Excepciones;

public class IntervaloExeption extends Exception {

    public IntervaloExeption() {
        super();
    }

    public IntervaloExeption(String message) {
        super(message);
    }

    public IntervaloExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public IntervaloExeption(Throwable cause) {
        super(cause);
    }
}
