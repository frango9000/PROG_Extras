package PROG_EJ_10_Excepciones;

public class DividirExeption extends Exception {

    public DividirExeption() {
        super();
    }

    public DividirExeption(String message) {
        super(message);
    }

    public DividirExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public DividirExeption(Throwable cause) {
        super(cause);
    }

    public DividirExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
