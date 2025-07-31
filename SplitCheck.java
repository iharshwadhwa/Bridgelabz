import java.util.Scanner;

public class SplitCheck {
    static int countLen(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
        }
        return i;
    }

    static String[] mySplit(String s) {
        int len = countLen(s);
        int words = 1;
        for (int i = 0; i < len; i++)
            if (s.charAt(i) == ' ')
                words++;

        String[] res = new String[words];
        int start = 0, w = 0;
        for (int i = 0; i <= len; i++) {
            if (i == len || s.charAt(i) == ' ') {
                String temp = "";
                for (int j = start; j < i; j++)
                    temp += s.charAt(j);
                res[w++] = temp;
                start = i + 1;
            }
        }
        return res;
    }

    static boolean isSame(String[] a, String[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i]))
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] m1 = mySplit(s);
        String[] m2 = s.split(" ");
        System.out.println(isSame(m1, m2));
    }
}
