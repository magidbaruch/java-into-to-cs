public class q2 {
    public static int findPeak(int [] arr)
    {
        int low=0;
        int high = arr.length-1;
        int mid;
        if(arr[low + 1] < arr[low])
        {
            return arr[low];
        }
        else if(arr[high-1]<arr[high])
        {
            return arr[high];
        }

        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]>=arr[mid+1] && arr[mid] >= arr[mid - 1])
            {
                return arr[mid];
            }
            else if(mid < arr.length - 1 && arr[mid] < arr[mid + 1])
            {
                low = mid + 1;
            }
            else if(mid > 0)
            {
                high = mid - 1;
            }

        }
        return -1;
    }
}

