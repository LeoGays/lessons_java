public class QuadraticTrinomial {

    private double a;
    private double b;
    private double c;

    public QuadraticTrinomial(double a, double b, double c) throws QuadraticException {
        if (a == 0 && b == 0) {
            throw  new QuadraticException(QuadraticEnum.NULL_COEFFICIENT);
        }
        setA(a);
        setB(b);
        setC(c);
    }

    public double []  roots() {
        double [] rootsEquation = new double[2];

        double discriminant = Math.sqrt(b*b - 4*a*c);

        if(discriminant > 0){
            rootsEquation[0] = ((-1)*b - discriminant) / 2*a;
            rootsEquation[1] = ((-1)*b + discriminant) / 2*a;
        }

        if (discriminant == 0) {
            rootsEquation[0] = ((-1)*b)/ 2*a;
            rootsEquation[1] = ((-1)*b)/ 2*a;
        }

        return rootsEquation;
    }

    public double maxRoots() throws QuadraticException {
        double [] roots = roots();

        if (roots.equals(null)) {
            throw  new QuadraticException(QuadraticEnum.NO_ROOTS);
        }

        if ( roots[0] >= roots[1]) {
            return roots[0];
        } else {
            return roots[1];
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) throws QuadraticException {
        if (a == 0) {
            throw new QuadraticException(QuadraticEnum.WRONG_HIGNER_COEFFICIENT_STRING);
        }
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
