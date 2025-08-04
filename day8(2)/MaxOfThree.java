import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Max: " + getMax(a, b, c));
    }

    static int getMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
