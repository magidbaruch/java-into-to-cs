public class q1 {
    public static int greatestRoute(int [][] mat)
    {
        int [][] copy = new int[mat.length][mat[0].length];
        arrCopy(mat, copy, 0, 0);
        return greatestRoute(mat, copy, "", 0, 0, 0 );
    }

    private static int greatestRoute(int[][] mat, int[][]arrCopy, String str1, int sum, int i, int j) {
        if (i == mat.length || j == mat[0].length || i < 0 || j < 0 || mat[i][j] == 0)
        {
            return Integer.MIN_VALUE;
        }
        if (i == mat.length - 1 && j == mat[0].length - 1) {
            sum += arrCopy[i][j];
            str1 += "(" + i + "," + j + ")";
            System.out.println(str1 + " = " + sum);
            return sum;
        }
        mat[i][j] -= 1;
        int up = greatestRoute(mat, arrCopy, str1 + "(" + i + "," + j + ")" + " --> ", sum + arrCopy[i][j], i + 1, j);
        int down = greatestRoute(mat, arrCopy, str1 + "(" + i + "," + j + ")" + " --> ", sum + arrCopy[i][j], i - 1, j);
        int left = greatestRoute(mat, arrCopy, str1 + "(" + i + "," + j + ")" + " --> ", sum + arrCopy[i][j], i, j + 1);
        int right = greatestRoute(mat, arrCopy, str1 + "(" + i + "," + j + ")" + " --> ", sum + arrCopy[i][j], i, j - 1);
        mat[i][j] += 1;
        return Math.max(up, Math.max(down, Math.max(left, right)));
    }

    private static void arrCopy(int[][] mat, int[][] copy, int i, int j)
    {
        copy[i][j] = mat[i][j];
        if (j == mat[0].length - 1) {
            if (i == mat.length - 1)
                return;
            arrCopy(mat, copy, i + 1, 0);
        }
        else
            arrCopy(mat, copy, i, j + 1);
    }

}
