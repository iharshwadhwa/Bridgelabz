public class MatrixUtils {

    public static int[][] createMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = (int) (Math.random() * 10);
        return mat;
    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < res.length; i++)
            for (int j = 0; j < res[0].length; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    public static int[][] subtract(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < res.length; i++)
            for (int j = 0; j < res[0].length; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] res = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }

    public static int[][] transpose(int[][] a) {
        int[][] res = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[j][i] = a[i][j];
        return res;
    }

    public static double determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static double[][] inverse2x2(int[][] m) {
        double det = determinant2x2(m);
        if (det == 0)
            return null;
        return new double[][] {
                { m[1][1] / det, -m[0][1] / det },
                { -m[1][0] / det, m[0][0] / det }
        };
    }
}
