import java.util.Scanner;

public class TrigFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        return new double[] { Math.sin(rad), Math.cos(rad), Math.tan(rad) };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        double[] res = calculateTrigonometricFunctions(angle);
        System.out.println("Sin: " + res[0] + " Cos: " + res[1] + " Tan: " + res[2]);
    }
}
