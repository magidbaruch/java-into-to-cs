public class q2 {

    public static int findSingle(int[] arr)
    {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while(low != high)
        {
            mid=(low + high) / 2;
            if(arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1] )
            {
                return arr[mid];
            }

            if(arr[mid] == arr[mid + 1] )
            {
                if(((high - (mid + 1)) % 2) == 1)
                {
                    low = mid + 2;
                }
                else
                {
                    high = mid - 1;
                }

            }
            else if(arr[mid] == arr[mid - 1] )
            {
                if(((high - (mid - 1)) % 2) == 1)
                {
                    high = mid - 2;
                }
                else
                {
                    low = mid + 1;
                }

            }
        }
        return arr[low];
    }

}
