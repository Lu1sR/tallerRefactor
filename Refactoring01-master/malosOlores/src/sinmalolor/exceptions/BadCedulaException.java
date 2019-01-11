package sinmalolor.exceptions;

public class BadCedulaException extends Exception {
    public BadCedulaException() {
        super("Número de cédula incorrecto.");

    }

    public BadCedulaException(String msg) {
        super(msg);
    }

    public BadCedulaException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
