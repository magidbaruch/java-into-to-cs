public class q2 {

    public static int averege(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        int index = 0;
        int sum = 0;
        int count = 0;
        int sumMax = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        sumMax = Math.abs(((arr[start]) / (start + 1)) - ((sum - arr[start]) / (end - start)));
        count += arr[start];
        start = 1;
        while (start <= end)
        {
            if(Math.abs(((count + arr[start]) / (start + 1)) - ((sum - (count + arr[start])) / ((end - start) + 1))) > sumMax)
            {
                index = start;
                sumMax = Math.abs(((count + arr[start]) / (start + 1)) - ((sum - (count + arr[start])) / (end - start)));
            }
            count += arr[start];
            start++;
        }
        return index;
    }
}
