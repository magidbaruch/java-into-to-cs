public class q2 {

    public static int whatEff(int[] a) {
        if (a == null || a.length < 2)
            return 0;

        int min = a[0];
        int maxDiff = 0;

        for (int i = 1; i < a.length; i++) {
            int currentDiff = a[i] - min;
            if (currentDiff > maxDiff) {
                maxDiff = currentDiff;
            }

            if (a[i] < min)
                min = a[i];
        }

        return maxDiff;
    }
}
