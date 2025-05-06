public class q2 {

    public static int shortestRoad(int[] road1, int[] road2)
    {
        int sumRoad1 = 0;
        int sumRoad2 = 0;
        int r1 = 0;
        int r2 = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < road1.length; i++)
        {
            sumRoad1 += road1[i];
            sumRoad2 += road2[i];
        }
        int min = Math.min(sumRoad1, sumRoad2);
        for(int i = 0; i < road1.length; i++)
        {
            r1 += road1[i];
            r2 += road2[i];
            sum1 = sumRoad1 -r1 + r2;
            sum2 = sumRoad2 -r2 + r1;
            min = Math.min(Math.min(sum1, sum2), min);
        }
        return min;
    }
}
