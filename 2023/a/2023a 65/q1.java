public class q1 {
    public static int countPairs (int n)
    {
        return countPairs(n, 0, 0, "");
    }
    private static int countPairs (int n, int lengthLeft, int lengthRight, String pairs)
    {
        if(lengthLeft < lengthRight || lengthLeft + lengthRight == n * 2 && lengthLeft > lengthRight)
            return 0;
        if (lengthLeft + lengthRight == n * 2)
        {
            System.out.println(pairs);
            return 1;
        }
        return countPairs(n, lengthLeft + 1, lengthRight, pairs + "(" ) +
                countPairs(n, lengthLeft, lengthRight + 1, pairs + ")" );
    }

}
