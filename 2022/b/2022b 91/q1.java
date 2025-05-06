public class q1 {
    public static int cheapRt(int[]arr,int step1,int step2,int limit)
    {
        return cheapRt(arr,step1,step2,limit,0,0," ");
    }

    private static int cheapRt(int[]arr,int step1,int step2,int limit,int i,int sum,String str)
    {

        if(i == arr.length - 1 && limit >= 0)
        {
            sum += arr[i];
            System.out.println(str + "=" + sum);
            return sum;
        }

        if(i > arr.length-1 || limit<0)
        {
            return Integer.MAX_VALUE;
        }

        return Math.min(cheapRt(arr, step1, step2, limit,i + step1,sum + arr[i],str + i + " "),
                cheapRt(arr, step1, step2,limit - 1,i + step2,sum+arr[i],str + i + " "));
    }
}
