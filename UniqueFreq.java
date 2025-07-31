import java.util.Scanner;

public class UniqueFreq {
    static char[] getUnique(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++)
                if (s.charAt(j) == ch)
                    found = true;
            if (!found)
                res += ch;
        }
        return res.toCharArray();
    }

    static String[][] freqUsingUnique(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;
        char[] uniq = getUnique(s);
        String[][] res = new String[uniq.length][2];
        for (int i = 0; i < uniq.length; i++) {
            res[i][0] = String.valueOf(uniq[i]);
            res[i][1] = String.valueOf(freq[uniq[i]]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] res = freqUsingUnique(s);
        for (String[] row : res)
            System.out.println(row[0] + " : " + row[1]);
    }
}
