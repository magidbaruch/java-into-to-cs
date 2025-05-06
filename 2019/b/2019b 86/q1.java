public class q1 {

    public static int howManyPathes(int[][] mat)
    {
        return howManyPathes(mat, 0, 0);
    }

    private static int howManyPathes(int[][] mat, int i, int j)
    {
        if(i < 0 || j < 0 || i > mat.length - 1 || j > mat[0].length - 1 || mat[i][j] == -1)
        {
            return 0;
        }

        if(i == mat.length - 1 && j == mat[0].length - 1)
        {
            return 1;
        }
        int temp=mat[i][j];
        mat[i][j] =- 1;
        int up = howManyPathes(mat, i - temp, j);
        int down = howManyPathes(mat, i + temp, j);
        int right = howManyPathes(mat, i, j + temp);
        int left = howManyPathes(mat, i, j - temp);
        mat[i][j] = temp;
        return up + down + right + left;
    }
}
