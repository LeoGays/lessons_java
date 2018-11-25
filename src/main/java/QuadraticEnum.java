public enum  QuadraticEnum {

    WRONG_HIGNER_COEFFICIENT_STRING("A is zero"),
    NULL_COEFFICIENT("Zero coefficients"),
    NO_ROOTS("There are not roots");

    private String errorString;

    private QuadraticEnum(String errorString) {
        this.errorString = errorString;
    }

    public String getErrorString() {
        return errorString;
    }



}
