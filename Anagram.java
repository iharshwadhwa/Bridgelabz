import java.util.Scanner;

public class Anagram {
    static boolean check(String a, String b) {
        if (a.length() != b.length())
            return false;
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        for (int i = 0; i < a.length(); i++) {
            freq1[a.charAt(i)]++;
            freq2[b.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++)
            if (freq1[i] != freq2[i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(check(a, b));
    }
}
