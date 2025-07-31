
//Q6:Substring Occurrences
import java.util.*;

class SubOcc {
    static int count(String s, String sub) {
        int c = 0;
        for (int i = 0; i <= s.length() - sub.length(); i++)
            if (s.substring(i, i + sub.length()).equals(sub))
                c++;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(count(sc.nextLine(), sc.nextLine()));
    }
}