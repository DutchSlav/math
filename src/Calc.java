public class Calc {
    public double power(double a, double b) { return Math.pow(a, b); }

    public double upArrow(double a, double b, int arrows) {
        int iter = 0;
        double val = a;
        while (iter < arrows) {
            iter++;
            val = Math.pow(val, b);
        }
        return val;
    }
}
