import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextDouble();
            weight[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 25) status[i] = "Normal";
            else if (bmi[i] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Height: " + height[i] + " Weight: " + weight[i] +
                               " BMI: " + bmi[i] + " Status: " + status[i]);
        }
    }
}
