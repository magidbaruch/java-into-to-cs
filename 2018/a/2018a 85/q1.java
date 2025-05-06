public class q1 {

    public static int longestSlope(int[][]mat,int num)
    {
        return longestSlope(mat, num, 0, 0, 0);
    }


    private static int longestSlope(int[][]mat, int num, int i, int j, int max)
    {
        if(j == mat[0].length)
            return longestSlope(mat, num, i+1,0, max);
        else if(i == mat.length)
            return max;
        else
        {
            int path= findPath(mat,num,i,j,mat[i][j]+num);
            return longestSlope(mat,num,i,j+1, Math.max(path,max));
        }
    }


    public static int findPath(int[][]mat, int num, int i, int j, int last)
    {
        if(i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || last-mat[i][j] != num)
        {
            return 0;
        }
        int up = findPath(mat, num, i-1, j, mat[i][j]) + 1;
        int down = findPath(mat, num, i+1, j, mat[i][j]) + 1;
        int right = findPath(mat, num, i, j+1, mat[i][j]) + 1;
        int left = findPath(mat, num, i, j-1, mat[i][j]) + 1;
        return Math.max(Math.max(up, down), Math.max(right, left));
    }

}
