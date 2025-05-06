public class q1 {

    public static int oneFiveSeven (int n)
    {
        if (n < 0)
            return Integer.MAX_VALUE;

        if (n == 0)
            return 0;

        int one = 1 + oneFiveSeven(n - 1);
        int five = 1 + oneFiveSeven(n - 5);
        int seven = 1 + oneFiveSeven(n - 7);
        int sum = one;

        if (five < sum && five >= 0)
            sum = five;

        if (seven < sum && seven >= 0)
            sum = seven;

        return sum;
    }
}
