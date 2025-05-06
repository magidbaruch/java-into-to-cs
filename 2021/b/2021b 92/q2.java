public class q2 {
    public static int longestSequence(int[] a, int k)
    {
        int start = 0;
        int end = 0;
        while (end < a.length)
        {
            if (a[end] == 0)
            {
                k--;
            }
            if (k < 0)
            {
                if (a[start] == 0)
                {
                    k++;
                }
                start++;
            }
            end++;
        }
        return end - start;
    }
}
