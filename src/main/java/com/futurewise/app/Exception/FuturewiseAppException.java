package com.futurewise.app.Exception;
import io.sentry.Sentry;
public class FuturewiseAppException extends Throwable {

    private static final long serialVersionUID = 1L;
    private String message;


    public String getMessage() {
        return message;
    }

    public FuturewiseAppException() {

    }

    public FuturewiseAppException(String message) {
        super(message);
        this.message = message;
        Sentry.capture(message);
    }

    public FuturewiseAppException(Throwable throwable) {
        super(throwable);
    }

    public FuturewiseAppException(String message, Throwable throwable) {
        super(message, throwable);
    }

    @Override
    public String toString() {
        return message;
    }

}
