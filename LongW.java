// Q5: Longest Word
import java.util.*;
class LongW {
    static String find(String s) {
        String[] a = s.split(" ");
        String b = "";
        for (String x : a)
            if (x.length() > b.length())
                b = x;
        return b;
    }

    public static void main(String[] args) {
        System.out.println(find(new Scanner(System.in).nextLine()));
    }
}
