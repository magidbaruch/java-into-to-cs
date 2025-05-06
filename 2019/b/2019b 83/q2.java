public class q2 {

    public static int howManyNegitiveNumbers(int[][] mat)
    {
        int i = 0;
        int j = 0;
        int count = 0;
        while(i < mat.length && j < mat[0].length)
        {
            if(j == mat[i].length - 1)
            {
                if(mat[i][j] < 0)
                {
                    count++;
                }
                i++;
                //j=0;
            }
            if(mat[i][j] < 0)
            {
                count++;
            }
            j++;
        }
        return count;
    }
}
