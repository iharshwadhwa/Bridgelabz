import java.util.Scanner;

public class AIOBDemo {
    static void crash(String[] arr) {
        System.out.println(arr[arr.length]);
    }

    static void handle(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < 3; i++)
            names[i] = sc.nextLine();
        // crash(names); // Uncomment to crash
        handle(names);
    }
}
