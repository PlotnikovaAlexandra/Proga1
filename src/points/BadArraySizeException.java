package points;

/**
 * Created by Student on 25.09.17.
 */
public class BadArraySizeException extends Throwable {
    public BadArraySizeException() {
    }

    public BadArraySizeException(String message) {
        super(message);
    }

    public BadArraySizeException(Throwable cause) {
        super(cause);
    }
}
