import java.util.Scanner;

public class CHocolateDivider {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[] { chocolates / children, chocolates % children };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] res = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets " + res[0] + " chocolates and " + res[1] + " are left");
    }
}
