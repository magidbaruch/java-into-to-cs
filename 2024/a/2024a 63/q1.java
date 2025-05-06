public class q1 {
    public static int minPoint(int[][] m) {
        return minPoint(m, 0, 0, 1);
    }

    private static int minPoint(int[][] mat, int i, int j, int number) {
        if (i > mat.length - 1 || j > mat[0].length - 1 || j < 0 || number < 0) {
            return Integer.MAX_VALUE;
        }

        if (i == mat.length - 1 && j == mat[0].length - 1)
        {
            if (number - mat[i][j] < 0) {
                return Math.abs(number - mat[i][j]);
            }
            return number - mat[i][j];
        }
        return Math.min(
                minPoint(mat, i + 1, j, number - mat[i][j]),
                minPoint(mat, i, j + 1, number - mat[i][j])
        );
    }

}
