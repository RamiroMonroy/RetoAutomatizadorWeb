package co.com.bancolombia.Automatizacion.exceptions;

public class ThreadStoppedException extends RuntimeException {

    public ThreadStoppedException(String message, Throwable cause){
        super(message,cause);
    }
}
