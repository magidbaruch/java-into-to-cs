public class q1 {

    public static boolean checkPath(int [][] mat)
    {
        int sum = checkSum(mat, 0, 0, 0);
        return checkSumPath(mat, 0, 0, sum) != 0;
    }

    public static int checkSum(int [][] mat, int i, int j, int sum)
    {
        if (j >= mat[0].length)
        {
            i += 1;
            j = 0;
        }
        if (i >= mat.length)
            return sum;
        return checkSum(mat, i, j+1, sum + mat[i][j]);
    }

    public static int checkPathsThroughOnes(int [][] mat)
    {
        int sum = checkSum(mat,0, 0, 0);
        return checkSumPath(mat, 0, 0, sum);
    }

    public static int checkSumPath(int [][] mat, int i, int j, int sum)
    {
        if ( i >=mat.length || j >= mat[0].length)
            return 0;
        if ( i == mat.length-1 && j == mat[0].length -1 && sum -1 == 0)
            return 1;
        return checkSumPath(mat, i, j+1, sum - mat[i][j]) + checkSumPath(mat, i+1, j, sum - mat[i][j]);
    }


}
