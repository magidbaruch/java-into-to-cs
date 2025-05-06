public class q2 {

    public static boolean findSum(int[] a, int sum)
    {
        int low = 0, high = a.length - 1;

        if (a[0] > a[high])
        {
            for (int i = 0; i < high; i++) {
                if (a[i] > a[i + 1]) {
                    low = i + 1;
                    high = i;
                    i = a.length;
                }
            }
        }

        while (low != high)
        {
            if (a[low] + a[high] == sum)
                return true;

            else if (a[low] + a[high] > sum)
            {
                high--;
                if (high == 0)
                    high = a.length - 1;
            }
            else 
            {
                low++;
                if (low > a.length - 1)
                    low = 0;
            }
        }

        return false;
    }

}
