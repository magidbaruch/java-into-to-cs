public class q1 {

    public static int ways(int k, int n) {
        if (k < 0)
            return 0;

        if (n == 0 && k == 0)
            return 1;

        return ways(k - 1, n - 1) + ways(k - 1, n + 1);
    }

}
