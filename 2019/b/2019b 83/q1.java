public class q1 {

    public static int longestPath(int [][] mat, int x, int y)
    {
        return longestPath(mat, x, y, 0, 0);
    }
    private static int longestPath(int [][] mat, int x, int y, int i, int j)
    {
        if (i < 0 || j < 0 || i == mat.length || j == mat[0].length || mat[i][j] == 0)
            return Integer.MIN_VALUE;
        if (i == x && j == y)
            return 1;
        int temp = mat[i][j];
        mat[i][j] = 0;
        int up = 1 + longestPath(mat, x, y, i + 1, j);
        int down = 1 + longestPath(mat, x, y, i - 1, j);
        int left = 1 + longestPath(mat, x, y, i, j + 1);
        int right = 1 + longestPath(mat, x, y, i, j - 1);
        mat[i][j] = temp;
        return Math.max(Math.max(up, down), Math.max(left, right));
    }
}
