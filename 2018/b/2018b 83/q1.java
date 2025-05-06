public class q1 {

    public static int prince(int[][] drm, int i, int j)
    {
        int steps = prince(drm, i, j, drm[i][j]) + 1;
        if(steps >= 9999)
        {
            return -1;
        }
        else
            return steps;
    }

    public static int prince(int[][]drm, int i, int j, int last)
    {
        if(i < 0 || j < 0 || i > drm.length - 1 || j > drm[0].length - 1)
        {
            return 9999;
        }
        if(drm[i][j] == -1)
        {
            return 0;
        }
        if(last - drm[i][j] > 2 || last - drm[i][j] < -1)
        {
            return 9999;
        }
        int temp = drm[i][j];
        drm[i][j] = -10;

        int up = prince(drm, i - 1, j, temp) + 1;
        int down = prince(drm, i + 1, j, temp) + 1;
        int right = prince(drm, i, j + 1, temp) + 1;
        int left = prince(drm, i, j - 1, temp) + 1;

        drm[i][j] = temp;
        int min1 = Math.min(up, down);
        int min2 = Math.min(right, left);
        return Math.min(min1, min2);
    }
}
