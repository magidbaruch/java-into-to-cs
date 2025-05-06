public class q1 {

    public static int cntTrueReg(boolean[][] mat) {
        return cntTrueReg(mat, 0, 0, 0);
    }

    private static int cntTrueReg(boolean[][] mat, int row, int col, int count) {
        if (row == mat.length) {
            return count;
        }

        if (col == mat.length) {
            return cntTrueReg(mat, row + 1, 0, count);
        }

        if (mat[row][col]) {
            count++;
            clearRegion(mat, row, col);
        }

        return cntTrueReg(mat, row, col + 1, count);
    }

    private static void clearRegion(boolean[][] mat, int row, int col)
    {
        if (row >= 0 && row < mat.length && col >= 0 && col < mat.length || !mat[row][col])
            return;

        mat[row][col] = false;

        clearRegion(mat, row, col - 1);
        clearRegion(mat, row, col + 1);
        clearRegion(mat, row - 1, col);
        clearRegion(mat, row + 1, col);
    }

}
