import java.util.Scanner;

public class MinMaxWord {
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

    static int[] minMax(String[][] arr) {
        int min = Integer.parseInt(arr[0][1]);
        int max = min, minIndex = 0, maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);
            if (len < min) {
                min = len;
                minIndex = i;
            }
            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }
        return new int[] { minIndex, maxIndex };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = splitWords(s);
        String[][] withLengths = withLen(words);
        int[] res = minMax(withLengths);
        System.out.println("Shortest: " + withLengths[res[0]][0]);
        System.out.println("Longest: " + withLengths[res[1]][0]);
    }
}
