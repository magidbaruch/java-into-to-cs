public class q1 {
    public static boolean split3(int[] arr) {
        return split3(arr, 0, 0, 0, 0);
    }

    private static boolean split3(int[] arr, int set1, int set2, int set3, int i) {
        if (i == arr.length)
            return set1 == set2 && set1 == set3;

        return split3(arr, set1 + arr[i], set2, set3, i + 1) ||
               split3(arr, set1, set2 + arr[i], set3, i + 1) ||
               split3(arr, set1, set2, set3 + arr[i], i + 1);
    }
}
