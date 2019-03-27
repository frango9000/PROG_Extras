package PROG_EJ_10_Excepciones;

public class NoNumExeption extends Exception {

    public NoNumExeption() {
        super();
    }

    public NoNumExeption(String message) {
        super(message);
    }

    public NoNumExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public NoNumExeption(Throwable cause) {
        super(cause);
    }
}
