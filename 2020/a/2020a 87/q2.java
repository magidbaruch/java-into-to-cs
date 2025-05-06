public class q2 {

    public static void printTriplets(int[] a, int num) {
        int low = 0;
        int mid = 1;
        int high = a.length - 1;
        String str = " ";
        while (mid < high)
        {
            if(low==0 && mid+1==high&&(a[low] * a[mid] * a[high]) != num)
            {
                low = low + 1;
                mid = low + 1;
                high = a.length - 1;
            }
            if ((a[low] * a[mid] * a[high]) == num)
            {
                str+=a[low] + "\t" + a[mid] + "\t" + a[high] + "\n";
                low = low + 1;
                mid = low + 1;
                high = a.length - 1;
            }
            else if ((a[low] * a[mid] * a[high]) < num)
            {
                mid = mid + 1;
            }
            else
            {
                high=high-1;
            }
        }
        System.out.print(str);
    }
}
