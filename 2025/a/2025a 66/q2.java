public class q2 {
    public static int findDivisor (int [] arr)
    {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if (Math.abs(arr[i]) < minValue && Math.abs(arr[i]) != 1)
                minValue = arr[i];
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % minValue != 0)
                return -1;
        }
        return minValue;
    }
}
