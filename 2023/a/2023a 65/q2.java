public class q2 {
    public static boolean superInc (int [] arr, int k)
    {
        int high=arr.length-1;
        int sum = 0;
        while(high >= 0)
        {
            sum += arr[high];
            if(sum == k)
            {
                return true;
            }
            if(sum > k)
            {
                sum -= arr[high];
                high--;
            }
            else if(sum < k)
            {
                high--;
            }
        }
        return false;
    }
}
