import java.util.Scanner;

public class NFEDemo {
    static void crash(String s) {
        int x = Integer.parseInt(s);
        System.out.println(x);
    }

    static void handle(String s) {
        try {
            int x = Integer.parseInt(s);
            System.out.println(x);
        } catch (NumberFormatException e) {
            System.out.println("Not a valid number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // crash(s); // Uncomment to crash
        handle(s);
    }
}
