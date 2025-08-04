import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        char op = sc.next().charAt(0);
        double b = sc.nextDouble();

        switch (op) {
            case '+':
                System.out.println(add(a, b));
                break;
            case '-':
                System.out.println(sub(a, b));
                break;
            case '*':
                System.out.println(mul(a, b));
                break;
            case '/':
                System.out.println(div(a, b));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double mul(double a, double b) {
        return a * b;
    }

    static double div(double a, double b) {
        return b != 0 ? a / b : 0;
    }
}
