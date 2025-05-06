public class q1 {
    public static int findMaxPrice(int[] prices, int n)
    {
        return findMaxPrice(prices, n, 1);
    }

    private static int findMaxPrice(int[] prices, int n, int i)
    {
        if (i > prices.length - 1 || n < 0)
            return Integer.MIN_VALUE;
        if (n == 0)
            return 0;
        return Math.max(findMaxPrice(prices, n - i, i) + prices[i], findMaxPrice(prices, n, i + 1));
    }
}
