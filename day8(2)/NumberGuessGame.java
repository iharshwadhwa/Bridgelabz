import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100, guess;
        String feedback;

        while (low <= high) {
            guess = (low + high) / 2;
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            feedback = sc.next().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Guessed it!");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else {
                low = guess + 1;
            }
        }
    }
}
