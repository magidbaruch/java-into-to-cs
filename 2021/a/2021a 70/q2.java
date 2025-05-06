public class q2 {

    public static int getMedian(int[] a, int[] b) {
        int len = a.length, low = 0, high = len;

        while (low <= high)
        {
            int i = (low + high) / 2;
            int j = len - i;

            int aLeft = (i == 0) ? Integer.MIN_VALUE : a[i - 1];
            int aRight = (i == len) ? Integer.MAX_VALUE : a[i];

            int bLeft = (j == 0) ? Integer.MIN_VALUE : b[j - 1];
            int bRight = (j == len) ? Integer.MAX_VALUE : b[j];

            if (aLeft <= bRight && bLeft <= aRight)
            {
                return (Math.max(aLeft, bLeft) + Math.min(aRight, bRight)) / 2;
            }
            else if (aLeft > bRight)
            {
                high = i - 1;
            }
            else
            {
                low = i + 1;
            }
        }

        return -1;
    }

}
