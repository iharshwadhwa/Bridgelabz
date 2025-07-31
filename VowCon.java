import java.util.Scanner;

public class VowCon {
    static String check(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            ch = (char) (ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "NotALetter";
    }

    static int[] count(String s) {
        int[] res = new int[2];
        for (int i = 0; i < s.length(); i++) {
            String type = check(s.charAt(i));
            if (type.equals("Vowel"))
                res[0]++;
            else if (type.equals("Consonant"))
                res[1]++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] result = count(s);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
