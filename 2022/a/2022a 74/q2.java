public class q2 {
    public static int findDuplicate(int[] a)
    {
        int i = 0;
        while (i < a.length)
        {
            if (a[i] != i + 1)
            {
                if (a[a[i] - 1] == a[i])
                    return a[i];

                int temp = a[i];
                a[i] = a[temp - 1];
                a[temp - 1] = temp;
            }
            else
                i++;
        }
        return -1;
    }
}
