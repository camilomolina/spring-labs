package cl.bennu.labs.spring.common.exception;

public class ForeignKeyException extends Exception {
    public ForeignKeyException() {
        super();
    }

    public ForeignKeyException(String message) {
        super(message);
    }

    public ForeignKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public ForeignKeyException(Throwable cause) {
        super(cause);
    }

    protected ForeignKeyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
