import java.util.Scanner;

public class CharFreq {
    static String[][] freqTable(String s) {
        int[] freq = new int[256];
        boolean[] added = new boolean[256];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;
        String[][] res = new String[s.length()][2];
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!added[ch]) {
                res[idx][0] = String.valueOf(ch);
                res[idx][1] = String.valueOf(freq[ch]);
                added[ch] = true;
                idx++;
            }
        }
        String[][] finalRes = new String[idx][2];
        for (int i = 0; i < idx; i++)
            finalRes[i] = res[i];
        return finalRes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] output = freqTable(s);
        for (String[] row : output)
            System.out.println(row[0] + " : " + row[1]);
    }
}
