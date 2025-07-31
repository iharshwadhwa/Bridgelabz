import java.util.Scanner;

public class Upper {
    static String toUpper(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                res += (char) (ch - 32);
            else
                res += ch;
        }
        return res;
    }

    static boolean same(String a, String b) {
        if (a.length() != b.length())
            return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i))
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String m1 = toUpper(s);
        String m2 = s.toUpperCase();
        System.out.println("Match: " + same(m1, m2));
    }
}
