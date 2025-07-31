import java.util.Scanner;

public class WordLen {
    static int findLen(String s) {
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

    static String[] splitWords(String s) {
        int len = findLen(s);
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

    static String[][] withLen(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(findLen(words[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = splitWords(s);
        String[][] output = withLen(words);
        for (int i = 0; i < output.length; i++)
            System.out.println(output[i][0] + " - " + output[i][1]);
    }
}
