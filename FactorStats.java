import java.util.*;

public class FactorStats {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                factors[idx++] = i;
        return factors;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int i : arr)
            total += i;
        return total;
    }

    public static int product(int[] arr) {
        int prod = 1;
        for (int i : arr)
            prod *= i;
        return prod;
    }

    public static int squareSum(int[] arr) {
        int total = 0;
        for (int i : arr)
            total += Math.pow(i, 2);
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] factors = findFactors(n);
        System.out.println("Sum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Square Sum: " + squareSum(factors));
    }
}
