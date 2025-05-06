public class q1 {
    public static int makeSum(int[] lengthes, int k, int num)
    {
        return makeSum(lengthes, k, num, 0);
    }

    private static int makeSum(int[] lengthes, int k, int num, int i)
    {
        if (i == lengthes.length || k < 0 || num < 0)
            return 0;
        if (k == 0)
            return 1;
        return makeSum(lengthes, k - lengthes[i], num - 1, i) +
               makeSum(lengthes, k, num, i + 1);
    }

}
