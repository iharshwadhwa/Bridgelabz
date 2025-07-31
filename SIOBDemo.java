import java.util.Scanner;

public class SIOBDemo {
    static void crash(String str) {
        System.out.println(str.charAt(str.length()));
    }

    static void handle(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // crash(s); // Uncomment to crash
        handle(s);
    }
}
