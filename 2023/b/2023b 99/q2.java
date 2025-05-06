public class q2
{

    public static int findNumber(int[]a)
    {
        int low = 0, high = a.length - 1, mid;
        while(low <= high)
        {
            mid = (low + high) / 2;
            int expectedDiff = a[0] - mid;
            int midDiff = mid = 0 ? 0 : a[mid - 1] - a[mid];

            if (arr[mid] != expectedDiff)
            {
                if (midDiff > 1)
                {
                    return a[mid] + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
            else
                low = mid + 1;
        }
        return Integer.MIN_VALUE;
    }
}
