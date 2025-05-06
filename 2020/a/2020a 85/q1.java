public class q1 {

    public static int findMaximum(int[][]mat)
    {
        if(mat[0][0] == -1)
        {
            return -1;
        }
        return findMaximum(mat, 0, 0);
    }

    private static int findMaximum(int[][]mat, int i, int j)
    {

        if(i <0 || j < 0 || i > mat[0].length-1 || j > mat[0].length-1 || mat[i][j] == -1)
        {
            return 0;
        }

        if(i % 2 == 0)
        {
            return Math.max(mat[i][j]+findMaximum(mat, i, j + 1), mat[i][j] + findMaximum(mat, i + 1, j));
        }
        else

        {
            return Math.max(mat[i][j] + findMaximum(mat, i, j - 1), mat[i][j] + findMaximum(mat, i + 1, j));
        }

    }
}
