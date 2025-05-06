public class q2
{
    public static int countSubArray(int[] arr, int num)
    {
        int count = 0, sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] <= num)
            {
                count += 1;
                sum += count;
            }
            else
            {
                count = 0;
            }
        }
        return sum;
    }

}
