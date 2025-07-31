import java.util.Scanner;

public class NoDup {
    static String clean(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++)
            if (r.indexOf(s.charAt(i)) == -1)
                r += s.charAt(i);
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(clean(sc.nextLine()));
    }
}
