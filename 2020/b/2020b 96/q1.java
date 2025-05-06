public class q1 {
    public static int maxSumKnight(int[][] mat) {
        if (mat.length < 2) {
            return -1;
        }
        return maxSumKnight(mat, 0, 0, 0, mat[0][0]);
    }

    private static int maxSumKnight(int[][] mat, int i, int j, int sum, int prev) {
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || Math.abs(prev - mat[i][j]) > 1 || mat[i][j] == -1)
            return -1;

        if (i == mat.length - 1 && j == mat[0].length - 1) {
            return sum + mat[i][j];
        }

        prev = mat[i][j];
        sum += prev;
        mat[i][j] = -1;

        int upRight1 = maxSumKnight(mat, i + 1, j + 2, sum, prev);
        int upLeft1 = maxSumKnight(mat, i + 1, j - 2, sum, prev);
        int downRight1 = maxSumKnight(mat, i - 1, j + 2, sum, prev);
        int downLeft1 = maxSumKnight(mat, i - 1, j - 2, sum, prev);
        int upRight2 = maxSumKnight(mat, i + 2, j + 1, sum, prev);
        int upLeft2 = maxSumKnight(mat, i + 2, j - 1, sum, prev);
        int downRight2 = maxSumKnight(mat, i - 2, j + 1, sum, prev);
        int downLeft2 = maxSumKnight(mat, i - 2, j - 1, sum, prev);

        mat[i][j] = prev;

        return Math.max(Math.max(Math.max(upRight1, upLeft1), Math.max(downRight1, downLeft1)),
                Math.max(Math.max(upRight2, upLeft2), Math.max(downRight2, downLeft2))
        );
    }
}
