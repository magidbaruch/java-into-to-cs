public class q1
{

    public static int longestPath(int[][] mat) {
        return longestPath(mat, 0, 0);
    }

    public static int longestPath(int[][] mat, int i, int j)
    {
        if (i < 0 || i >= mat.length || j < 0 || j >= mat[0].length || mat[i][j] < 0)
            return 0;

        int temp = mat[i][j];
        if (mat[i][j] == 0)
        {
            mat[i][j] = -1;
            int maxOfZero = Math.max(longestPath(mat, i + 1, j) + 1,
                            Math.max(longestPath(mat, i - 1, j) + 1,
                            Math.max(longestPath(mat, i, j + 1) + 1,
                                     longestPath(mat, i, j - 1) + 1)));
            mat[i][j] = temp;
            return maxOfZero;
        }

        mat[i][j] = -1;
        int maxOfOne = Math.max(longestPath(mat, i + 1, j + 1) + 1,
                       Math.max(longestPath(mat, i - 1, j - 1) + 1,
                       Math.max(longestPath(mat, i + 1, j - 1) + 1,
                                longestPath(mat, i - 1, j + 1) + 1)));
        mat[i][j] = temp;
        return maxOfOne;

    }
}
