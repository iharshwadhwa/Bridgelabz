import java.util.Scanner;

public class PalCheck {
    static boolean loopCheck(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        return true;
    }

    static boolean recurCheck(String s, int l, int r) {
        if (l >= r)
            return true;
        if (s.charAt(l) != s.charAt(r))
            return false;
        return recurCheck(s, l + 1, r - 1);
    }

    static boolean arrCheck(String s) {
        char[] arr = s.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < arr.length; i++)
            rev[i] = s.charAt(arr.length - 1 - i);
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != rev[i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(loopCheck(s));
        System.out.println(recurCheck(s, 0, s.length() - 1));
        System.out.println(arrCheck(s));
    }
}
