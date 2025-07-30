import java.util.Scanner;

public class NaturalSum {
    public static int recursiveSum(int n) {
        return n == 1 ? 1 : n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0)
            return;
        System.out.println("Recursive Sum: " + recursiveSum(n));
        System.out.println("Formula Sum: " + formulaSum(n));
    }
}
