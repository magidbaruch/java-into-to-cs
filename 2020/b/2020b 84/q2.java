public class q2 {

    public static boolean isHighFactorInRange(int n, int low, int high) {
        for (int i = high; i >= low; i--) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void findFactors(int n) {
        int low = 1;
        int high = n - 1;
        int mid = high / 2;
        while (low < high) {
            if (isHighFactorInRange(n, mid + 1, high))
                low = mid + 1;
            else if (isHighFactorInRange(n, low, mid))
                high = mid;
            mid = (high + low) / 2;
        }
        System.out.println(mid + " * " + (n / mid) + " = " + n);
    }
}
