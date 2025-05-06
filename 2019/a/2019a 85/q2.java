public class q2 {

    public static int missingValue(int[] arr)
    {
        int diff = Math.min(arr[2] - arr[1], arr[1] - arr[0]);
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while(low <= high)
        {
            mid = (low + high) / 2;
            if((arr[mid] - diff) != arr[mid - 1] )
            {
                return arr[mid] - diff;
            }
            if((arr[mid] + diff) != arr[mid + 1])
            {
                return arr[mid] + diff;
            }
            if(arr[low] + (diff * mid) != arr[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return arr[low] + diff;
    }
}
