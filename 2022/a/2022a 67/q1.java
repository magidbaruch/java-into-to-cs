public class q1 {
    public static boolean isIdentity(int[][] mat, int x, int size) {
        return isIdentity(mat, x, size, x, x);
    }

    private static boolean isIdentity(int[][] mat, int x, int size, int i, int j)
    {
        if (j == size + x)
            return isIdentity(mat, x, size, i + 1, x);
        if (i == j && mat[i][j] != 1 || i != j && mat[i][j] != 0)
            return false;
        if (i == x + size - 1 && j == x + size - 1)
            return true;
        return isIdentity(mat, x, size, i, j + 1);
    }

    public static int maxMatrix(int[][] mat) {
        return maxMatrix(mat, 0, mat.length);
    }

    private static int maxMatrix(int[][] mat, int x, int size)
    {
        if (size == mat.length / 2)
        {
            if (mat[size][size] == 1)
                return 1;
            else
                return 0;
        }

        if (isIdentity(mat, x, size, x, x))
            return size - x;
        else
            return maxMatrix(mat, x + 1, size - 1);
    }
}
