import java.util.Scanner;

public class StrLen {
    static int findLen(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(findLen(s));
        System.out.println(s.length());
    }
}
