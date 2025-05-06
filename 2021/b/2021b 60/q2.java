public class q2 {
    public static int smallestSub(int[]a,int k)
    {
        int start = 0;
        int end = 0;
        int len = a.length;
        int minLen = len + 1;
        int sum = 0;
        while (end < len)
        {
            while(sum <= k && end < len)
            {
                sum += a[end];
                end++;
            }

            while(sum > k && start < len)
            {
                minLen = Math.min(minLen, end - start);
                sum -= a[start];
                start++;
            }
        }
        return minLen;
    }
}
