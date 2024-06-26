package codesquad.team05.exception;

public class DateAlreadyBookedException extends RuntimeException {
    public DateAlreadyBookedException() {
    }

    public DateAlreadyBookedException(String message) {
        super(message);
    }

    public DateAlreadyBookedException(String message, Throwable cause) {
        super(message, cause);
    }
}
