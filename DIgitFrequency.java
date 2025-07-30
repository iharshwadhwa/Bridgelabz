import java.util.Scanner;

public class DIgitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] digits = new int[10];
        int[] frequency = new int[10];

        while (num != 0) {
            int d = num % 10;
            digits[d]++;
            num /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (digits[i] > 0)
                System.out.println("Digit " + i + " = " + digits[i]);
        }
    }
}
