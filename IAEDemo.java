import java.util.Scanner;

public class IAEDemo {
    static void crash(String s) {
        System.out.println(s.substring(5, 2));
    }

    static void handle(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // crash(s); // Uncomment to crash
        handle(s);
    }
}
