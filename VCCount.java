import java.util.Scanner;

public class VCCount {
    static int[] countVC(String s) {
        int[] res = new int[2];
        for (char ch : s.toCharArray()) {
            char c = Character.toLowerCase(ch);
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1)
                    res[0]++;
                else
                    res[1]++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] out = countVC(s);
        System.out.println("Vowels: " + out[0]);
        System.out.println("Consonants: " + out[1]);
    }
}
