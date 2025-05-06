public class q2 {
    public static int findAlmostSorted(int [] arr, int num)
    {
        int low=0;
        int high=arr.length-1;
        int mid;
        while(low<high)
        {
            mid=(low+high)/2;
            if(arr[mid]==num)
            {
                return mid;
            }
            else if(arr[mid] < num && arr[mid-1] < num)
            {
                low=mid+1;
            }
            else if(arr[mid]>num && arr[mid+1] > num)
            {
                high=mid-1;
            }
            else if(arr[mid]< num && arr[mid-1]==num)
            {
                return mid-1;
            }
            else if(arr[mid] > num && arr[mid + 1] == num)
            {
                return mid+1;
            }
        }
        return -1;
    }
}
