public class PasswordGenerateException extends RuntimeException {

    PasswordGenerateException() {
    }

    @Override
    public String toString() {
        return "Please input a number equal to or greater than 8";
    }
}
