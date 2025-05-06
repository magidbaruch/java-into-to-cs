public class q1 {

    public static int friends3(int[][]mat)
    {
        return friends3(mat, 0 , 1, 2, 0);
    }

    private static int friends3(int[][]mat, int i, int j, int k, int count)
    {
        if (k == mat.length)
        {
            j++;
            k = j + 1;
        }

        if (j == mat.length - 1)
        {
            i++;
            j = i + 1;
            k = j + 1;
        }

        if (i == mat.length - 2)
        {
            return count;
        }

        if (mat[i][j] == 1 && mat[i][k] == 1 && mat[k][j] == 1)
        {
            System.out.println(i + " " + j + " " + k);
            count ++;
        }
        return friends3(mat, i, j, k + 1, count );
    }
}
