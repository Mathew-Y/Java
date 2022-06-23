public class YoungModulus {

    public static void main(String[] args) {
        double m = 0.095;
        double g = 9.8;
        double L = 0.20;
        double w = 0.005;
        double h = 0.005;
        double d = 0.05043;

        double Y = (m * g * (Math.pow(L, 3))) / (4 * w * (Math.pow(h, 3)) * d);

        System.out.println("Y: " + Y);
    }
}
