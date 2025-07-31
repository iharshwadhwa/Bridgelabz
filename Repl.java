import java.util.*;

class Repl {
    static String rep(String s, String a, String b) {
        String[] w = s.split(" ");
        for (int i = 0; i < w.length; i++)
            if (w[i].equals(a))
                w[i] = b;
        String r = "";
        for (String x : w)
            r += x + " ";
        return r.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(rep(sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
}