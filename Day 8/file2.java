import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        LocalDate date = LocalDate.parse(input);

        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Result Date: " + result);
    }
}
