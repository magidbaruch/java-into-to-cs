public class q1
{

    public static boolean isSum(int[] arr, int num)
    {
        return isSum (arr, num, 0, 0);
    }

    private static boolean isSum(int [] arr, int num, int i, int legitIndex)
    {
        if(legitIndex == 3)
            return false;

        if (num == 0)
            return true;

        if (i > arr.length - 1 || num < 0)
            return false;

        return isSum(arr, num - arr[i], i + 1, legitIndex + 1) || isSum(arr, num, i + 1, 0);
    }
}
