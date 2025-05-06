public class q2 {

    public static int meetingPoint(int[] a, int[] b)
    {
        int start = 0;
        int end = a.length > b.length ? b.length-1 : a.length-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(a[mid] == b[mid] && (mid == 0 || a[mid-1] != a[mid] || b[mid-1] != b[mid])){
                return mid;
            }
            else if(a[mid] > b[mid]){
                start = mid +1;

            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
