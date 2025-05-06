public class q2 {

    public static void wigglyArr(int[] arr, int med)
    {
        for (int i = 1; i < arr.length; i += 2)
        {
            if (i > 0 && arr[i] > arr[i - 1])
                swap(arr, i, i - 1);

            if (i < n - 1 && arr[i] > arr[i + 1])
                swap(arr, i, i + 1);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
