package sinmalolor.exceptions;

public class BadLastNameException extends Exception {
    public BadLastNameException() {
        super("Apellido incorrecto.");
    }

    public BadLastNameException(String s) {
        super(s);
    }

    public BadLastNameException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
