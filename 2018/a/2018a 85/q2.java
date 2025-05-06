public class q2 {

    public static int what(int[] a)
    {
        int sum = 0;
        int start = 0;
        int end = a.length - 1;

        for(int i = 0; i < a.length; i++)
        {
            sum += a[i];
        }

        if(sum % 2 == 1)
        {
            return a.length;
        }

        int firstOddIndex = -1;
        int lastOddIndex = -1;

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 1)
            {
                if (firstOddIndex == -1)
                {
                    firstOddIndex = i;
                }
                lastOddIndex = i;
            }
        }
        if (firstOddIndex == -1) {
            return 0;
        }

        int removeFirst = a.length - 1 - firstOddIndex;
        int removeLast = lastOddIndex;

        return Math.max(removeFirst, removeLast);

    }

}
