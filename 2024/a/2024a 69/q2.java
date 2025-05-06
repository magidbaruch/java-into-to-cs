public class q2 {
    public static void minNumWithSum(int[] arr, int s) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < 10; j++) {
                if ((arr.length - 1 - i) * 9 + j >= s) {
                    arr[i] = j;
                    break;
                }
            }
            s -= arr[i];
        }
    }

}
