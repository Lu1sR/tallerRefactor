package sinmalolor.exceptions;

public class BadNameException extends Exception {

    public BadNameException() {
        super("Nombre incorrecto");
    }

    public BadNameException(String msg) {
        super(msg);
    }

    public BadNameException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
