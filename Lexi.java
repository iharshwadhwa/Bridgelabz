import java.util.*;
class Lexi {
    static String cmp(String a, String b) {
        int n = Math.min(a.length(), b.length());
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) < b.charAt(i))
                return a + " < " + b;
            if (a.charAt(i) > b.charAt(i))
                return a + " > " + b;
        }
        if (a.length() == b.length())
            return "Equal";
        return a.length() < b.length() ? a + " < " + b : a + " > " + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(cmp(sc.nextLine(), sc.nextLine()));
    }
}