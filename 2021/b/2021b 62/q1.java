public class q1 {

    public static boolean equalSplit(int[] arr) {
        return equalSplit(arr, 0, 0, 0, 0, 0);
    }

    private static boolean equalSplit (int [] arr, int i, int sumA, int sumB, int countA, int countB) {
        if (i == arr.length && sumA == sumB && countA == countB)
            return true;
        if (i == arr.length)
            return false;
        return  equalSplit(arr, i + 1, sumA + arr[i], sumB, countA + 1, countB) ||
                equalSplit(arr, i + 1, sumA, sumB + arr[i], countA, countB + 1);
    }

}
