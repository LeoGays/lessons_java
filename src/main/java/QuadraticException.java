public class QuadraticException extends Exception {

    private QuadraticEnum  elemError;

    public QuadraticException(QuadraticEnum elemError) {
        this.elemError = elemError;
    }

    public QuadraticEnum getErrorCode() {
        return elemError;
    }



}
