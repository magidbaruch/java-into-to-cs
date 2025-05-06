public class q1 {
    public static int minOfMax(int[][]mat)
    {
        return minOfMax(mat,0,0,mat[0][0],mat[0][0]);
    }

    private static int minOfMax(int[][]mat,int i,int j,int max,int last)
    {
        if(i<0||j<0||i>mat.length-1||j>mat[0].length-1||last==-1)
        {
            return Integer.MAX_VALUE;
        }

        if(i==mat.length-1&&j==mat[0].length-1)
        {
            if(mat[i][j]>max)
            {
                return mat[i][j];
            }
            return max;
        }
        int temp=mat[i][j];
        mat[i][j] = -1;
        int up = minOfMax(mat,i + 1, j, Math.max(max, temp), temp);
        int down = minOfMax(mat,i - 1, j, Math.max(max, temp), temp);
        int right = minOfMax(mat,i,j + 1, Math.max(max, temp), temp);
        int left = minOfMax(mat,i,j - 1, Math.max(max, temp), temp);
        mat[i][j] = temp;
        return Math.min(Math.min(up, down), Math.min(right, left));
    }
}
