public class q2 {
    public static int get(int[] b, int k)
    {
        if (k == 0)
            return b[k];
        return b[k] - b[k - 1];
    }

    
    public static int find(int[] b, int x)
    {
        int left = 0;
        int right = b.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (get(b, mid) == x)
                return mid;

            if (get(b, mid) < x)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

}
