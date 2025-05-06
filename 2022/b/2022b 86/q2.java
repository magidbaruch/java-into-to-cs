public class q2 {
    
    public static void sortMod(int[] a, int k)
    {
        int index = 0;
        for (int j = 0; j < k; j++)
            for (int i = index; i < a.length; i++)
                if (a[i] % k == j)
                {
                    swap(a, i, index);
                    index ++;
                }
    }

    private static void swap(int[] a, int i, int index)
    {
        int temp = a[i];
        a[i] = a[index];
        a[index] = temp;
    }
}
