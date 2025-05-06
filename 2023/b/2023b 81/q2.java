public class q2
{

    public static void findSubArray(int[] a, int target)
    {
        int start = 0;
        int end = 0;
        int sum = 0;
        while(start <= end && end < a.length)
        {
            sum += a[end];
            if(sum == target)
            {
                System.out.println("Subarray found between indexes " + start + " and " + end + " with sum " + sum);
                return;
            }
            if(sum < target)
            {
                end++;
            }
            else
            {
                start++;
                sum = a[start];
                end = start + 1;
            }
        }
        System.out.println("No subarray found with sum " + target);
    }

}
