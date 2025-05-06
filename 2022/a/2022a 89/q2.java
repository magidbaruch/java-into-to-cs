public class q2 {
    public static int longestSubArray(int[]a)
    {
        int start=0;
        int end=0;
        int startMax = 0;
        int endMax = 0;
        int len = Integer.MIN_VALUE;
        boolean positive;

        if(a[0] > 0)
            positive = true;
        else
            positive = false;

        while(end<a.length)
        {
            if(a[end]>0&&positive||a[end]<0&&!positive)
            {
                end++;
                positive =! positive;
            }
            else
            {
                if((end - start) > len)
                {
                    len = end - start;
                    startMax = start;
                    endMax = end;
                }
                start++;
                end = start;
            }
        }
        return len;
    }
}
