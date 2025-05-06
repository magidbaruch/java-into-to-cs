public class q2 {
    public static int minimumSubK(int[]arr,int k)
    {
        int start = 0;
        int end = k;
        int sumMin = 0;
        int sum = 0;
        int j = 0;
        for(int i = 0; i < k; i++)
        {
            sumMin += arr[i];
        }
        sum = sumMin;
        for(int i = k; i < arr.length; i++)
        {
            sum += (arr[i]) - arr[j];
            if(sum < sumMin)
            {
                sumMin = sum;
                end = i;
                start = j + 1;
            }
            j++;
        }
        System.out.println("minimum sum sub array" + start + "," + end);
        return sumMin;
    }
}
