public class q1 {
    public static int lengthPath(char[][]mat,String pattern)
    {
        if (chekString(mat[0][0],pattern) == -1)
        {
            return 0;
        }
        return lengthPath(mat,pattern,0,0);
    }

    private static int lengthPath(char[][]mat,String pattern,int i,int j)
    {
        if(i<0||j<0||i>=mat.length||j>=mat[0].length||mat[i][j] == '-')
        {
            return Integer.MIN_VALUE;
        }
        char last=mat[i][j];
        mat[i][j]= '-';
        if((chekString(last,pattern) == 0))
        {
            return 0;
        }
        else
        {
            int up = 1+lengthPath(mat,pattern, i-1,j);
            int down = 1+lengthPath(mat,pattern, i+1,j);
            int right = 1+lengthPath(mat,pattern, i,j-1);
            int  left= 1+lengthPath(mat,pattern, i,j+1);
            mat[i][j]=last;
            return Math.max((Math.max(up,down)) , (Math.max(right,left)));
        }
    }

    private static int chekString(char c, String pattern)
    {
        if(pattern.indexOf(c) != -1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int maxPath(int[][]mat)
    {
        return maxPath(mat,0,0,0);
    }

    private static int maxPath(int[][]mat,int i,int j,int sum)
    {
        if(i<0||j<0||i>mat.length-1||j>mat[0].length-1)
        {
            return Integer.MIN_VALUE;
        }
        if(i==mat.length-1&&j==mat[0].length-1)
        {
            return sum+mat[i][j];
        }
        return Math.max(maxPath(mat,i+(mat[i][j]%10),j+(mat[i][j]/10),sum+mat[i][j]),maxPath(mat,i+(mat[i][j]/10),j+(mat[i][j]%10),sum+mat[i][j]));

    }
}
