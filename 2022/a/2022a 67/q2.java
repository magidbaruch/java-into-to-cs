public class q2 {
    public static int findMissingIndex(int[] a) {
        int low = 0;
        int high = a.length - 1;
        int mid = (low + high) / 2;
        int jump = Math.min(a[a.length - 1] - a[a.length - 2], a[1] - a[0]);
        while (low <= high)
        {
            if (a[mid] > a[low] + jump * (mid - low))
                high = mid;
            else
                low = mid + 1;

            mid = (low + high) / 2;
            if (mid >= 1 && a[mid] - a[mid - 1] > jump)
                return mid;
        }
        return a.length;
    }
}