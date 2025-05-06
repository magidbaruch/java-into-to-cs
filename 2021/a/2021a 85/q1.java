public class q1 {
    public static int minPrice(int[][] mat)
    {
        return minPrice(mat, 0, 0, 0);
    }

    public static int minPrice(int[][] mat, int i, int j, int sum)
    {
        if(j == mat[0].length - 1)
        {
            return mat[i][j] + sum;
        }

        if(i == j)
        {
            return minPrice(mat, i, j + 1, sum);
        }
        return Math.min(minPrice(mat, j, j, sum + mat[i][j]), minPrice(mat, i, j + 1, sum));
    }
}
