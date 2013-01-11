package exeptions;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 03.12.12
 * Time: 17:41
 */
public class ImageUploadException extends RuntimeException {
    public ImageUploadException(String message) {
        super(message);
    }

    public ImageUploadException(String message, Throwable cause) {
        super(message, cause);
    }
}
